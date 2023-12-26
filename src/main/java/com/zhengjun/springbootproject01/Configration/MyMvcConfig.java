package com.zhengjun.springbootproject01.Configration;

import com.zhengjun.springbootproject01.ServiceImpliment.InterceptorImp;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class MyMvcConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(new InterceptorImp()).addPathPatterns("/**").excludePathPatterns("/","/user/login","/asserts/**","/webjars/**");
    }
}
