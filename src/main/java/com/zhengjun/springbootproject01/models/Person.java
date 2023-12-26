package com.zhengjun.springbootproject01.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//Component，将类注入到spring容器中
@Component
//通过Configuration注解，定义为配置类，ConfigurationProperties定义前缀后面通过名称自动匹配，PropertySource定义配置文件路径
@Configuration
@ConfigurationProperties(prefix = "com.zj")
@PropertySource(value = "classpath:my.properties")
public class Person {
    //Value注解默认读取application.properties中的配置
    @Value("${application.title}")
    private String name;
    private int age;


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
