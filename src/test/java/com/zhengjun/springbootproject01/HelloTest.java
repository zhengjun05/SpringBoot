package com.zhengjun.springbootproject01;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class HelloTest {
    @Test
    public void hello(){
        Assert.state(2==2,"断言两个数据相等");
        System.out.println("hello spring boot test!");

    }

}
