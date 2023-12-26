package com.zhengjun.springbootproject01.models;

import org.springframework.stereotype.Component;

@Component
public class Student {

    private int id;
    private String name;
    private String phoneNum;
    private String email;

    public Student() {

    }

    public Student(int id, String name, String phoneNum, String email) {
        this.id = id;
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}
