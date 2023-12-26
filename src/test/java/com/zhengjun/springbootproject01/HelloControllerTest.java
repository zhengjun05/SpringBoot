package com.zhengjun.springbootproject01;

import com.zhengjun.springbootproject01.ServiceImpliment.ServiceInterfaceImpliment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@WebMvcTest
public class HelloControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void hello()throws  Exception{
        ServiceInterfaceImpliment impl=new ServiceInterfaceImpliment();
        impl.queryAllPersons();

    }

}
