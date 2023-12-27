package com.zhengjun.springbootproject01.ServiceImpliment;

import jakarta.servlet.*;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Date;

@Component
public class ConsumerTimerFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        System.out.println("time Filter begin");
        Long start=new Date().getTime();
        chain.doFilter(request,response);
        Long end=new Date().getTime();
        System.out.println("time Filter end,cost time:"+(end-start));

    }
}
