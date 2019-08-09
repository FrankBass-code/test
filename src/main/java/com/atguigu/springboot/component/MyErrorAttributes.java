//package com.atguigu.springboot.component;
//
//import org.omg.CORBA.Request;
//import org.omg.CORBA.ServerRequest;
//import org.springframework.boot.web.reactive.error.DefaultErrorAttributes;
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.RequestAttribute;
//
//import java.util.Map;
//
//@Component
//public class MyErrorAttributes extends DefaultErrorAttributes {
//
//    @Override
//    public Map<String, Object> getErrorAttributes(ServerRequest request, boolean includeStackTrace) {
//        return super.getErrorAttributes(request, includeStackTrace);
//    }
//
//    @Override
//    public Map<String, Object> getErrorAttributes(org.springframework.web.reactive.function.server.ServerRequest request, boolean includeStackTrace) {
//        return super.getErrorAttributes(request, includeStackTrace);
//    }
//}
