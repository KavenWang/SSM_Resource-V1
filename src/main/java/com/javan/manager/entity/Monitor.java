package com.javan.manager.entity;

import java.math.BigDecimal;

public class Monitor {
    /**
     * null
     */
    private String eventid;

    /**
     * null
     */
    private String userid;

    /**
     * null
     */
    private String account;

    /**
     * null
     */
    private String username;

    /**
     * null
     */
    private String description;

    /**
     * null
     */
    private BigDecimal activetime;

    /**
     * null
     */
    private String requestpath;

    /**
     * null
     */
    private String methodname;

    /**
     * null
     */
    private Long costtime;

    /**
     * null
     * @return EVENTID null
     */
    public String getEventid() {
        return eventid;
    }

    /**
     * null
     * @param eventid null
     */
    public void setEventid(String eventid) {
        this.eventid = eventid == null ? null : eventid.trim();
    }

    /**
     * null
     * @return USERID null
     */
    public String getUserid() {
        return userid;
    }

    /**
     * null
     * @param userid null
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * null
     * @return ACCOUNT null
     */
    public String getAccount() {
        return account;
    }

    /**
     * null
     * @param account null
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * null
     * @return USERNAME null
     */
    public String getUsername() {
        return username;
    }

    /**
     * null
     * @param username null
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * null
     * @return DESCRIPTION null
     */
    public String getDescription() {
        return description;
    }

    /**
     * null
     * @param description null
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * null
     * @return ACTIVETIME null
     */
    public BigDecimal getActivetime() {
        return activetime;
    }

    /**
     * null
     * @param activetime null
     */
    public void setActivetime(BigDecimal activetime) {
        this.activetime = activetime;
    }

    /**
     * null
     * @return REQUESTPATH null
     */
    public String getRequestpath() {
        return requestpath;
    }

    /**
     * null
     * @param requestpath null
     */
    public void setRequestpath(String requestpath) {
        this.requestpath = requestpath == null ? null : requestpath.trim();
    }

    /**
     * null
     * @return METHODNAME null
     */
    public String getMethodname() {
        return methodname;
    }

    /**
     * null
     * @param methodname null
     */
    public void setMethodname(String methodname) {
        this.methodname = methodname == null ? null : methodname.trim();
    }

    /**
     * null
     * @return COSTTIME null
     */
    public Long getCosttime() {
        return costtime;
    }

    /**
     * null
     * @param costtime null
     */
    public void setCosttime(Long costtime) {
        this.costtime = costtime;
    }
}