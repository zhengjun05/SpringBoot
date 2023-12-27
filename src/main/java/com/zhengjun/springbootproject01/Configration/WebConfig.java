package com.zhengjun.springbootproject01.Configration;

import com.zhengjun.springbootproject01.ServiceImpliment.ConsumerTimerFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class WebConfig {
    @Bean
    public FilterRegistrationBean consumerLoginFilterRegistration(){
        FilterRegistrationBean <ConsumerTimerFilter> registration=new FilterRegistrationBean<>();
        registration.setFilter(new ConsumerTimerFilter());
        registration.addUrlPatterns("/*");
        registration.setName("consumerLoginFilter");
        registration.setOrder(1);
        return  registration;
    }
}
