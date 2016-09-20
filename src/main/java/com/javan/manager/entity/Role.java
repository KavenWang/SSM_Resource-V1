package com.javan.manager.entity;

public class Role {
    /**
     * null
     */
    private String roleid;

    /**
     * null
     */
    private String rolename;

    /**
     * null
     */
    private String deptid;

    /**
     * null
     */
    private String roletype;

    /**
     * null
     */
    private String remark;

    /**
     * null
     */
    private String locked;

    /**
     * null
     */
    private String rolecode;

    /**
     * null
     * @return ROLEID null
     */
    public String getRoleid() {
        return roleid;
    }

    /**
     * null
     * @param roleid null
     */
    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    /**
     * null
     * @return ROLENAME null
     */
    public String getRolename() {
        return rolename;
    }

    /**
     * null
     * @param rolename null
     */
    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    /**
     * null
     * @return DEPTID null
     */
    public String getDeptid() {
        return deptid;
    }

    /**
     * null
     * @param deptid null
     */
    public void setDeptid(String deptid) {
        this.deptid = deptid == null ? null : deptid.trim();
    }

    /**
     * null
     * @return ROLETYPE null
     */
    public String getRoletype() {
        return roletype;
    }

    /**
     * null
     * @param roletype null
     */
    public void setRoletype(String roletype) {
        this.roletype = roletype == null ? null : roletype.trim();
    }

    /**
     * null
     * @return REMARK null
     */
    public String getRemark() {
        return remark;
    }

    /**
     * null
     * @param remark null
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * null
     * @return LOCKED null
     */
    public String getLocked() {
        return locked;
    }

    /**
     * null
     * @param locked null
     */
    public void setLocked(String locked) {
        this.locked = locked == null ? null : locked.trim();
    }

    /**
     * null
     * @return ROLECODE null
     */
    public String getRolecode() {
        return rolecode;
    }

    /**
     * null
     * @param rolecode null
     */
    public void setRolecode(String rolecode) {
        this.rolecode = rolecode == null ? null : rolecode.trim();
    }
}