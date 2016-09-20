package com.javan.workflow.common;

@SuppressWarnings("serial")
public class WorkflowException extends Exception{

	public WorkflowException(){}
	
	public WorkflowException(String message){
		super(message);
	}
}
