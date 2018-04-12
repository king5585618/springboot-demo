package com.saxon.springbootdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.saxon.springbootdemo.condition.LinuxCondition;
import com.saxon.springbootdemo.condition.WindowsCondition;
import com.saxon.springbootdemo.service.ListService;
import com.saxon.springbootdemo.service.impl.LinuxListService;
import com.saxon.springbootdemo.service.impl.WindowsListService;

/**
 * @author jinzj
 * @since v4.0.1
 */
@Configuration
public class ConditionConfig {

    @Bean
    @Conditional(WindowsCondition.class) // 通过@Conditional注解，符合Windows条件则实例化WindowsListService
    public ListService windowsListService(){
        return new WindowsListService();
    }

    @Bean
    @Conditional(LinuxCondition.class) // 通过@Conditional注解，符合Linux条件则实例化LinuxListService
    public ListService linuxListService(){
        return new LinuxListService();
    }

}
