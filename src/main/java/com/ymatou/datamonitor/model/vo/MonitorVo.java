/*
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 */
package com.ymatou.datamonitor.model.vo;

/**
 * 
 * @author qianmin 2016年8月18日 下午2:26:25
 *
 */
public class MonitorVo {
    
    private Long id;
    private String name;
    private Long dbSourceId;
    private String sql;
    private String cronExpression;
    private String scriptType;
    private String scriptCode;
    private String emails;
    private String phones;
    private Long emailThreshold;
    private Long phoneThreshold;
    private String remark;
    private String runStatus;
    private String title;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getDbSourceId() {
        return dbSourceId;
    }

    public void setDbSourceId(Long dbSourceId) {
        this.dbSourceId = dbSourceId;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    public String getScriptType() {
        return scriptType;
    }

    public void setScriptType(String scriptType) {
        this.scriptType = scriptType;
    }

    public String getScriptCode() {
        return scriptCode;
    }

    public void setScriptCode(String scriptCode) {
        this.scriptCode = scriptCode;
    }

    public String getEmails() {
        return emails;
    }

    public void setEmails(String emails) {
        this.emails = emails;
    }

    public String getPhones() {
        return phones;
    }

    public void setPhones(String phones) {
        this.phones = phones;
    }

    public Long getEmailThreshold() {
        return emailThreshold;
    }

    public void setEmailThreshold(Long emailThreshold) {
        this.emailThreshold = emailThreshold;
    }

    public Long getPhoneThreshold() {
        return phoneThreshold;
    }

    public void setPhoneThreshold(Long phoneThreshold) {
        this.phoneThreshold = phoneThreshold;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRunStatus() {
        return runStatus;
    }

    public void setRunStatus(String runStatus) {
        this.runStatus = runStatus;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
