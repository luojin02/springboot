package com.fortis.inspection.entity;

public class SysChannelEntity {

    private Integer channelId;      //渠道ID

    private String channelName;     //渠道名称

    private String email;       //电子邮箱

    private Long phone;      //手机号码

    private String enterprise;  //企业名称

    private String creditCode;  //统一社会信用代码

    private String accessKeyId; //系统分配的 AccessKeyID

    private String accessKeySecret;     //系统分配的 AccessKeySecret

    private Byte accessStatus;        //请求访问状态（0-禁用，1-启用）

    private String creator;     //创建者（超级管理员帐号）

    private String createTime;  //创建时间

    private String modifier;    //修改者（超级管理员帐号）

    private String modifyTime;      //修改时间

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }

    public String getCreditCode() {
        return creditCode;
    }

    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode;
    }

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public String getAccessKeySecret() {
        return accessKeySecret;
    }

    public void setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
    }

    public Byte getAccessStatus() {
        return accessStatus;
    }

    public void setAccessStatus(Byte accessStatus) {
        this.accessStatus = accessStatus;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }
}
