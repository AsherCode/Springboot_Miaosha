package com.itmayi.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangjian on 2018/3/25.
 */
@ControllerAdvice//全局拦截器切面
public class GloableExceptionHandler {
    @ExceptionHandler(RuntimeException.class)//拦截运行时异常
    @ResponseBody//拦截返回是json返回结果
    public Map<String,Object> exceptionHandler(){
        Map<String,Object> result = new HashMap<String, Object>();
        result.put("code","500");
        result.put("msg","系统错误");
        return result;
    }
}
