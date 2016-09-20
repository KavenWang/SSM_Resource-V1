package com.javan.utils;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.CompilationUnit;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.InnerClass;
import org.mybatis.generator.api.dom.java.InnerEnum;
import org.mybatis.generator.api.dom.java.JavaElement;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.config.MergeConstants;
import org.mybatis.generator.config.PropertyRegistry;

public class MyCommentGenerator implements CommentGenerator{

	private Properties properties;
	private Properties systemPro;
	private boolean suppressDate;
	private boolean suppressAllComments;
	private String currentDateStr;
	public MyCommentGenerator() {
	    super();
	    properties = new Properties();
	    systemPro = System.getProperties();
	    suppressDate = false;
	    suppressAllComments = false;
	    currentDateStr = (new SimpleDateFormat("yyyy-MM-dd")).format(new Date());
	}
	@Override
	public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable) {
		if (suppressAllComments) {
	        return;
	    }
	    StringBuilder sb = new StringBuilder();
	    innerClass.addJavaDocLine("/**");
	    sb.append(" * ");
	    sb.append(introspectedTable.getFullyQualifiedTable());
	    sb.append(" ");
	    sb.append(getDateString());
	    innerClass.addJavaDocLine(sb.toString());
	    innerClass.addJavaDocLine(" */");
	}

	@Override
	public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable, boolean arg2) {
		if (suppressAllComments) {
	        return;
	    }

	    StringBuilder sb = new StringBuilder();

	    innerClass.addJavaDocLine("/**");
	    sb.append(" * ");
	    sb.append(introspectedTable.getFullyQualifiedTable());
	    innerClass.addJavaDocLine(sb.toString());

	    sb.setLength(0);
	    sb.append(" * @author ");
	    sb.append(systemPro.getProperty("user.name"));
	    sb.append(" ");
	    sb.append(currentDateStr);

	    //      addJavadocTag(innerClass, markAsDoNotDelete);

	    innerClass.addJavaDocLine(" */");
	}

	@Override
	public void addComment(XmlElement arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addConfigurationProperties(Properties arg0) {
		 this.properties.putAll(properties);
		 //suppressDate = isTrue(properties.getProperty(PropertyRegistry.COMMENT_GENERATOR_SUPPRESS_DATE));
		 //suppressAllComments = isTrue(properties.getProperty(PropertyRegistry.COMMENT_GENERATOR_SUPPRESS_ALL_COMMENTS));
	}

	@Override
	public void addEnumComment(InnerEnum innerEnum, IntrospectedTable introspectedTable) {
		 if (suppressAllComments) {
		        return;
		    }

		    StringBuilder sb = new StringBuilder();

		    innerEnum.addJavaDocLine("/**");
		    //      addJavadocTag(innerEnum, false);
		    sb.append(" * ");
		    sb.append(introspectedTable.getFullyQualifiedTable());
		    innerEnum.addJavaDocLine(sb.toString());
		    innerEnum.addJavaDocLine(" */");
	}

	@Override
	public void addFieldComment(Field field, IntrospectedTable introspectedTable) {
		if (suppressAllComments) {
	        return;
	    }

	    StringBuilder sb = new StringBuilder();

	    field.addJavaDocLine("/**");
	    sb.append(" * ");
	    sb.append(introspectedTable.getFullyQualifiedTable());
	    field.addJavaDocLine(sb.toString());
	    field.addJavaDocLine(" */");
	}

	@Override
	public void addFieldComment(Field field, IntrospectedTable arg1, IntrospectedColumn introspectedColumn) {
		if (suppressAllComments) {
	        return;
	    }

	    StringBuilder sb = new StringBuilder();

	    field.addJavaDocLine("/**");
	    sb.append(" * ");
	    sb.append(introspectedColumn.getRemarks());
	    field.addJavaDocLine(sb.toString());

	    //      addJavadocTag(field, false);

	    field.addJavaDocLine(" */");
	}

	@Override
	public void addGeneralMethodComment(Method arg0, IntrospectedTable arg1) {
		if (suppressAllComments) {
	        return;
	    }
	}

	@Override
	public void addGetterComment(Method method, IntrospectedTable arg1, IntrospectedColumn introspectedColumn) {
		if (suppressAllComments) {
	        return;
	    }

	    method.addJavaDocLine("/**");

	    StringBuilder sb = new StringBuilder();
	    sb.append(" * ");
	    sb.append(introspectedColumn.getRemarks());
	    method.addJavaDocLine(sb.toString());

	    sb.setLength(0);
	    sb.append(" * @return ");
	    sb.append(introspectedColumn.getActualColumnName());
	    sb.append(" ");
	    sb.append(introspectedColumn.getRemarks());
	    method.addJavaDocLine(sb.toString());

	    //      addJavadocTag(method, false);

	    method.addJavaDocLine(" */");
	}

	@Override
	public void addJavaFileComment(CompilationUnit arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addRootComment(XmlElement arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addSetterComment(Method method, IntrospectedTable arg1, IntrospectedColumn introspectedColumn) {
		if (suppressAllComments) {
	        return;
	    }


	    method.addJavaDocLine("/**");
	    StringBuilder sb = new StringBuilder();
	    sb.append(" * ");
	    sb.append(introspectedColumn.getRemarks());
	    method.addJavaDocLine(sb.toString());

	    Parameter parm = method.getParameters().get(0);
	    sb.setLength(0);
	    sb.append(" * @param ");
	    sb.append(parm.getName());
	    sb.append(" ");
	    sb.append(introspectedColumn.getRemarks());
	    method.addJavaDocLine(sb.toString());

	    //      addJavadocTag(method, false);

	    method.addJavaDocLine(" */");
	}
	
	
	/**
	 * This method returns a formated date string to include in the Javadoc tag
	 * and XML comments. You may return null if you do not want the date in
	 * these documentation elements.
	 * 
	 * @return a string representing the current timestamp, or null
	 */
	protected String getDateString() {
	    String result = null;
	    if (!suppressDate) {
	        result = currentDateStr;
	    }
	    return result;
	}
	
	/**
	 * This method adds the custom javadoc tag for. You may do nothing if you do
	 * not wish to include the Javadoc tag - however, if you do not include the
	 * Javadoc tag then the Java merge capability of the eclipse plugin will
	 * break.
	 * 
	 * @param javaElement
	 *            the java element
	 */
	protected void addJavadocTag(JavaElement javaElement, boolean markAsDoNotDelete) {
	    javaElement.addJavaDocLine(" *");
	    StringBuilder sb = new StringBuilder();
	    sb.append(" * ");
	    sb.append(MergeConstants.NEW_ELEMENT_TAG);
	    if (markAsDoNotDelete) {
	        sb.append(" do_not_delete_during_merge");
	    }
	    String s = getDateString();
	    if (s != null) {
	        sb.append(' ');
	        sb.append(s);
	    }
	    javaElement.addJavaDocLine(sb.toString());
	}
	
}
