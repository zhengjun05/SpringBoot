package com.zhengjun.springbootproject01.ServiceImpliment;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

import java.io.IOException;
//拦截器
public class InterceptorImp implements HandlerInterceptor {
    /*注册拦截器*/
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handler) throws ServletException, IOException {
        Object user=request.getSession().getAttribute("user");
        if(user==null){
            request.setAttribute("msg","你没有权限这么做");
            request.getRequestDispatcher("/").forward(request,response);
        }
        return true;

    }
}
