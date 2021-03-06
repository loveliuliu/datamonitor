/*
 *
 *  (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 *  All rights reserved.
 *
 */

package com.ymatou.datamonitor.config;

import com.baidu.disconf.client.common.annotations.DisconfFile;
import com.baidu.disconf.client.common.annotations.DisconfFileItem;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@DisconfFile(fileName = "biz.properties")
public class BizConfig {

    private String ldapUrl;
    
    private String smsUrl;
    
    private String domain;
    
    private String env;
    
    private boolean phoneMonitorOn;

    private int serverPort;

    private String kafkaMonitorEmails;
    private String kafkaMonitorPhones;

    @DisconfFileItem(name = "biz.ldapUrl")
    public String getLdapUrl() {
        return ldapUrl;
    }

    public void setLdapUrl(String ldapUrl) {
        this.ldapUrl = ldapUrl;
    }

    @DisconfFileItem(name = "biz.smsUrl")
    public String getSmsUrl() {
        return smsUrl;
    }

    public void setSmsUrl(String smsUrl) {
        this.smsUrl = smsUrl;
    }

    @DisconfFileItem(name = "biz.domain")
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @DisconfFileItem(name = "biz.env")
    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    @DisconfFileItem(name = "biz.phoneMonitorOn")
    public boolean isPhoneMonitorOn() {
        return phoneMonitorOn;
    }

    @DisconfFileItem(name = "server.port")
    public int getServerPort() {
        return serverPort;
    }

    public void setServerPort(int serverPort) {
        this.serverPort = serverPort;
    }

    public void setPhoneMonitorOn(boolean phoneMonitorOn) {
        this.phoneMonitorOn = phoneMonitorOn;
    }

    @DisconfFileItem(name = "biz.kafkaMonitorEmails")
    public String getKafkaMonitorEmails() {
        return kafkaMonitorEmails;
    }

    public void setKafkaMonitorEmails(String kafkaMonitorEmails) {
        this.kafkaMonitorEmails = kafkaMonitorEmails;
    }

    @DisconfFileItem(name = "biz.kafkaMonitorPhones")
    public String getKafkaMonitorPhones() {
        return kafkaMonitorPhones;
    }

    public void setKafkaMonitorPhones(String kafkaMonitorPhones) {
        this.kafkaMonitorPhones = kafkaMonitorPhones;
    }
}
