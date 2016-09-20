package com.javan.service.impl;

import org.kie.api.cdi.KSession;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

import com.javan.entity.Person;

@Service
public class DroolsTestServiceImpl {
	
	@KSession("bookprice_ksession")
	private KieSession kSession;
	
	public String getNewPerson(Person person){
		if (person == null) {
			throw new NullPointerException("person can not be null.");
		}
		
		kSession.insert(person);
		int count = kSession.fireAllRules();
		System.out.println(count);
		return person.toString();
	}
}
