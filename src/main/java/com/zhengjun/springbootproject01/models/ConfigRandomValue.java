package com.zhengjun.springbootproject01.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigRandomValue {
    @Value("${cfg.random.intNum}")
    private int intNum;
    @Value("${cfg.random.uuid}")
    private String uuid;

    public int getIntNum() {
        return intNum;
    }

    public void setIntNum(int intNum) {
        this.intNum = intNum;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
