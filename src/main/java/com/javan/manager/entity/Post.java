package com.javan.manager.entity;

public class Post {
    /**
     * null
     */
    private String postid;

    /**
     * null
     */
    private String postname;

    /**
     * null
     */
    private String deptid;

    /**
     * null
     */
    private String remark;

    /**
     * null
     * @return POSTID null
     */
    public String getPostid() {
        return postid;
    }

    /**
     * null
     * @param postid null
     */
    public void setPostid(String postid) {
        this.postid = postid == null ? null : postid.trim();
    }

    /**
     * null
     * @return POSTNAME null
     */
    public String getPostname() {
        return postname;
    }

    /**
     * null
     * @param postname null
     */
    public void setPostname(String postname) {
        this.postname = postname == null ? null : postname.trim();
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
}