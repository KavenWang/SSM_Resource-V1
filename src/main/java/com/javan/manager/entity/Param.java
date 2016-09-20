package com.javan.manager.entity;

public class Param {
    /**
     * null
     */
    private String paramid;

    /**
     * null
     */
    private String paramkey;

    /**
     * null
     */
    private String paramvalue;

    /**
     * null
     */
    private String remark;

    /**
     * null
     * @return PARAMID null
     */
    public String getParamid() {
        return paramid;
    }

    /**
     * null
     * @param paramid null
     */
    public void setParamid(String paramid) {
        this.paramid = paramid == null ? null : paramid.trim();
    }

    /**
     * null
     * @return PARAMKEY null
     */
    public String getParamkey() {
        return paramkey;
    }

    /**
     * null
     * @param paramkey null
     */
    public void setParamkey(String paramkey) {
        this.paramkey = paramkey == null ? null : paramkey.trim();
    }

    /**
     * null
     * @return PARAMVALUE null
     */
    public String getParamvalue() {
        return paramvalue;
    }

    /**
     * null
     * @param paramvalue null
     */
    public void setParamvalue(String paramvalue) {
        this.paramvalue = paramvalue == null ? null : paramvalue.trim();
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