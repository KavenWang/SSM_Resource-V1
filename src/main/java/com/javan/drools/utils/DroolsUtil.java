package com.javan.drools.utils;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.drools.core.io.impl.UrlResource;
import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.Message;
import org.kie.api.builder.Message.Level;
import org.kie.api.definition.KiePackage;
import org.kie.api.definition.rule.Rule;
import org.kie.api.event.rule.ObjectInsertedEvent;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.ObjectFilter;
import org.kie.api.runtime.rule.FactHandle;
import org.kie.internal.io.ResourceFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Drools相关操作工具类
 * @author wangwei
 *
 */
public class DroolsUtil {
	 private static Logger log = LoggerFactory.getLogger(DroolsUtil.class);
	 public static KieContainer createKieContainer(DroolsResource[] resources) throws KieBuildException {
	        KieServices kieServices = createAndBuildKieServices(resources);        
	        KieContainer kieContainer = kieServices.newKieContainer(kieServices.getRepository().getDefaultReleaseId());
	        return kieContainer;
	    }
	 
	 public static KieServices createAndBuildKieServices(DroolsResource[] resources) throws KieBuildException {
	        KieServices kieServices = KieServices.Factory.get();
	        KieFileSystem kfs = kieServices.newKieFileSystem();
	        
	        for (DroolsResource resource : resources) {
	            if(log.isDebugEnabled()){
	                log.debug("  Resource: " + resource.getType() + ", path type="
	                        + resource.getPathType() + ", path=" + resource.getPath());
	            }
	            switch (resource.getPathType()) {
	            case CLASSPATH:
	                kfs.write(ResourceFactory.newClassPathResource(resource.getPath()));
	                break;
	            case FILE:
	                kfs.write(ResourceFactory.newFileResource(resource.getPath()));
	                break;
	            case URL:
	                UrlResource urlResource = (UrlResource) ResourceFactory
	                        .newUrlResource(resource.getPath());
	                
	                if (resource.getUsername() != null) {
	                    if(log.isDebugEnabled()){
	                        log.info("Setting authentication for: " + resource.getUsername());
	                    }
	                    urlResource.setBasicAuthentication("enabled");
	                    urlResource.setUsername(resource.getUsername());
	                    urlResource.setPassword(resource.getPassword());
	                }
	                
	                kfs.write(urlResource);
	                
	                break;
	            default:
	                throw new IllegalArgumentException(
	                        "Unable to build this resource path type.");
	            }
	        }
	        
	        KieBuilder kieBuilder = kieServices.newKieBuilder(kfs).buildAll();
	        
	        if (kieBuilder.getResults().hasMessages(Level.ERROR)) {
	            List<Message> errors = kieBuilder.getResults().getMessages(Level.ERROR);
	            StringBuilder sb = new StringBuilder("Errors:");
	            for (Message msg : errors) {
	                sb.append("\n  " + prettyBuildMessage(msg));
	            }
	            throw new KieBuildException(sb.toString());
	        }
	        
	        return kieServices;
	    }
	
	 private static String prettyBuildMessage(Message msg) {
	        return "Message: {"
	            + "id="+ msg.getId()
	            + ", level=" + msg.getLevel()
	            + ", path=" + msg.getPath()
	            + ", line=" + msg.getLine()
	            + ", column=" + msg.getColumn()
	            + ", text=\"" + msg.getText() + "\""
	            + "}";
	    }

}
