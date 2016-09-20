package com.javan.workflow.service;

import org.activiti.engine.impl.persistence.entity.ProcessDefinitionEntity;
import org.activiti.engine.impl.pvm.PvmActivity;
import org.activiti.engine.impl.pvm.process.ActivityImpl;
import org.activiti.engine.impl.task.TaskDefinition;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.Execution;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;

import com.javan.workflow.common.WorkflowException;

/**
 * 工作流常用核心方法封装
 * <pre>2016-09-09 新建</pre>
 * @author wangwei
 * 
 */
public interface BaseProcessService {
	/**
     * 方法说明 ： 根据流程定义Key查询最新流程定义.
     *
     * @param processDefinitionKey
     * @throws WorkflowException
     */
    public ProcessDefinition findLatestProcessDefinitionByPrcDefKey(String processDefinitionKey) throws WorkflowException;
     
    /**
     * 方法说明 ： 根据流程定义Id查询流程定义.
     *
     * @param processDefinitionId  流程定义Id
     * @throws WorkflowException
     */
    public ProcessDefinitionEntity findProcessDefinitionEntityByProcDefId(String processDefinitionId) throws WorkflowException;
         
    /**
     *
     * 方法说明  ： 根据流程实例Id查询流程实例.
     *
     * @param processInstanceId 流程实例Id
     * @return
     * @throws WorkflowException
     */
    public ProcessInstance findProcessInstanceByProcInst(String processInstanceId) throws WorkflowException;
     
    /**
     * 根据流程实例Id查询流程实例.
     *
     * @param processInstanceId
     * @throws WorkflowException
     */
    public Execution findExecutionByProcInst(String processInstanceId) throws WorkflowException;
     
    /**
     * 方法说明 ： 根据流程实例Id查询任务.
     *
     * @param processInstanceId 流程实例Id
     * @throws WorkflowException
     */
    public Task findTaskByProcInstId(String processInstanceId) throws WorkflowException;
     
    /**
     * 方法说明 ： 根据实例Id查询任务.
     *
     * @param executionId 实例Id
     * @throws WorkflowException
     */
    public Task findTaskByExecutionId(String executionId) throws WorkflowException;
     
    /**
     * 方法说明 ： 根据活动节点查询任务定义.
     *
     * @param activityImpl  活动节点
     * @throws WorkflowException
     */
    public TaskDefinition findTaskDefinitionByActivityImpl(ActivityImpl activityImpl) throws WorkflowException;
     
    /**
     * 方法说明 : 查询上一个节点.
     *
     * @param activityImpl 活动节点
     * @param activityId 当前活动节点ID 
     * @param elString
     * @throws ShineException
     */
    public TaskDefinition beforeTaskDefinition(ActivityImpl activityImpl,String activityId, String elString) throws WorkflowException;
     
    /**
     * 方法说明 : 查询下一个节点.
     *
     * @param activityImpl 活动节点
     * @param activityId 当前活动节点ID 
     * @param elString
     * @throws ShineException
     */
    public TaskDefinition nextTaskDefinition(ActivityImpl activityImpl,String activityId, String elString) throws WorkflowException;
 
    /**
     * 方法说明： 根据活动节点、活动线路查询线路的连接线.
     *
     * @throws WorkflowException
     */
    public PvmActivity findPvmActivity(ActivityImpl activityImpl, String transitions) throws WorkflowException;
     
    /**
     * 方法说明 ：根据流程定义Id查询任务定义
     *
     * @param processDefinitionId 流程定义Id
     * @return
     * @throws WorkflowException
     */
    public TaskDefinition findTaskDefinition(String processDefinitionId) throws WorkflowException;
     
    /**
     * 方法说明 ： 添加任务意见.
     *
     * @param taskId      任务Id
     * @param processInstanceId   流程实例Id
     * @param comment     意见
     * @throws WorkflowException
     */
    public void addTaskComment(String taskId, String processInstanceId, String comment) throws WorkflowException;
     
    /**
     * 方法说明 ： 拾取任务.
     *
     * @param taskId  任务Id
     * @param operator 办理人
     * @throws WorkflowException
     */
    public void claimTask(String taskId, String operator) throws WorkflowException;
     
    /**
     * 方法说明 ： 根据流程定义Id查询最新流程定义.
     *
     * @param processDefinitionId 流程定义Id
     * @return
     * @throws WorkflowException
     */
    public ProcessDefinition findProcessDefinitionByPrcDefId(String processDefinitionId) throws WorkflowException;
}
