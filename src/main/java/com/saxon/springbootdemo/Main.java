package com.saxon.springbootdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.saxon.springbootdemo.config.ConditionConfig;
import com.saxon.springbootdemo.service.ListService;

/**
 * @author jinzj
 * @since v4.0.1
 */
public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);

        ListService listService = context.getBean(ListService.class);

        System.out.println(context.getEnvironment().getProperty("os.name") + "系统下的列表命令为：" + listService.showListCmd());
    }
}
