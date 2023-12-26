package com.zhengjun.springbootproject01;

import com.zhengjun.springbootproject01.models.ConfigRandomValue;
import com.zhengjun.springbootproject01.models.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.util.Assert;

@SpringBootTest

public class HelloTest {
    @Autowired
    //通过Environment获取全局的配置
    private Environment env;
    @Autowired
    private Person person;
    @Autowired
    private ConfigRandomValue configRandomValue;
    @Test
    public void hello(){
        Assert.state(2==2,"断言两个数据相等");
        System.out.println(person.getName());
        System.out.println(env.getProperty("server.port"));
        System.out.println(person.getAge());
        System.out.println(configRandomValue.getUuid());
        System.out.println(configRandomValue.getIntNum());

    }

}
