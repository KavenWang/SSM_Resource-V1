package com.javan.manager.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
/**
 * �û���Ϣ��
 * @author wangwei
 *
 */
@SuppressWarnings("serial")
public class User implements Serializable {
    /**
     * �û�id
     */
    private String userid;

    /**
     * �û�����
     */
    private String username;

    /**
     * ��¼����
     */
    private String account;

    /**
     * null
     */
    private String password;

    /**
     * �Ա�(0:δ֪;1:��;2:Ů)
     */
    private String sex;

    /**
     * ��������id
     */
    private String deptid;

    /**
     * ������־(1:����;0:����)
     */
    private String locked;

    /**
     * ��ע
     */
    private String remark;

    /**
     * ��Ա����(1:����Ա;2:����Ա;3:ϵͳ������Ա;)
     */
    private String usertype;

    /**
     * ����״̬(1:����;0:����)
     */
    private String enabled;

    /**
     * �ֻ�
     */
    private String mobile;

    /**
     * ����
     */
    private String email;

    /**
     * ��ַ
     */
    private String address;

    /**
     * ��Ա����
     */
    private String personid;

    /**
     * ���֤��
     */
    private String cardid;

    /**
     * ��¼ʧ�ܴ���
     */
    private BigDecimal logincount;

    /**
     * ��¼ʱ��
     */
    private Date logintime;

    /**
     * ҵ������
     */
    private String bustype;

    /**
     * ֤������
     */
    private String certtype;

    /**
     * ֤������
     */
    private String certcode;

    /**
     * �̶��绰
     */
    private String telephone;

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
     * @return PASSWORD null
     */
    public String getPassword() {
        return password;
    }

    /**
     * null
     * @param password null
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * null
     * @return SEX null
     */
    public String getSex() {
        return sex;
    }

    /**
     * null
     * @param sex null
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
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
     * @return USERTYPE null
     */
    public String getUsertype() {
        return usertype;
    }

    /**
     * null
     * @param usertype null
     */
    public void setUsertype(String usertype) {
        this.usertype = usertype == null ? null : usertype.trim();
    }

    /**
     * null
     * @return ENABLED null
     */
    public String getEnabled() {
        return enabled;
    }

    /**
     * null
     * @param enabled null
     */
    public void setEnabled(String enabled) {
        this.enabled = enabled == null ? null : enabled.trim();
    }

    /**
     * null
     * @return MOBILE null
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * null
     * @param mobile null
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * null
     * @return EMAIL null
     */
    public String getEmail() {
        return email;
    }

    /**
     * null
     * @param email null
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * null
     * @return ADDRESS null
     */
    public String getAddress() {
        return address;
    }

    /**
     * null
     * @param address null
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * null
     * @return PERSONID null
     */
    public String getPersonid() {
        return personid;
    }

    /**
     * null
     * @param personid null
     */
    public void setPersonid(String personid) {
        this.personid = personid == null ? null : personid.trim();
    }

    /**
     * null
     * @return CARDID null
     */
    public String getCardid() {
        return cardid;
    }

    /**
     * null
     * @param cardid null
     */
    public void setCardid(String cardid) {
        this.cardid = cardid == null ? null : cardid.trim();
    }

    /**
     * null
     * @return LOGINCOUNT null
     */
    public BigDecimal getLogincount() {
        return logincount;
    }

    /**
     * null
     * @param logincount null
     */
    public void setLogincount(BigDecimal logincount) {
        this.logincount = logincount;
    }

    /**
     * null
     * @return LOGINTIME null
     */
    public Date getLogintime() {
        return logintime;
    }

    /**
     * null
     * @param logintime null
     */
    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    /**
     * null
     * @return BUSTYPE null
     */
    public String getBustype() {
        return bustype;
    }

    /**
     * null
     * @param bustype null
     */
    public void setBustype(String bustype) {
        this.bustype = bustype == null ? null : bustype.trim();
    }

    /**
     * null
     * @return CERTTYPE null
     */
    public String getCerttype() {
        return certtype;
    }

    /**
     * null
     * @param certtype null
     */
    public void setCerttype(String certtype) {
        this.certtype = certtype == null ? null : certtype.trim();
    }

    /**
     * null
     * @return CERTCODE null
     */
    public String getCertcode() {
        return certcode;
    }

    /**
     * null
     * @param certcode null
     */
    public void setCertcode(String certcode) {
        this.certcode = certcode == null ? null : certcode.trim();
    }

    /**
     * null
     * @return TELEPHONE null
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * null
     * @param telephone null
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }
}