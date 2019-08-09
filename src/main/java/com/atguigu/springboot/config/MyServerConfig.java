package com.atguigu.springboot.config;

import com.atguigu.springboot.servlet.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Servlet;

@Configuration
public class MyServerConfig {
@Bean
    public ServletRegistrationBean myServlet(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new MyServlet(),"/myServlet");
        return  registrationBean;
//
//    ServletRegistrationBean<Servlet> registration = new ServletRegistrationBean<>();
//    // 创建自定义的Servlet对象
//    MyServlet servlet = new MyServlet();
//    // 注册Servlet
//    registration.setServlet(servlet);
//    // 设置Servlet名称
//    registration.setName("second_servlet");
//    // 设置Servlet配置规则
//    registration.addUrlMappings("/second_servlet");
//    // 设置加载参数
//    registration.setLoadOnStartup(1);
//    return registration;

    }
}
