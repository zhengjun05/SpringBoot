package com.zhengjun.springbootproject01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringBootProject01Application {

    public static void main(String[] args) {
        //定义读取配置文件，默认读取application.properties
//        new SprinApplicationBuilder(SpringBootProject01Application.class).properties("spring.config.location=classpath:/application.yml").run(args);
        SpringApplication.run(SpringBootProject01Application.class, args);
    }

}
