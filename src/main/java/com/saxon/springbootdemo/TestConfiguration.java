package com.saxon.springbootdemo;

import com.saxon.springbootdemo.property.TestProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * @author jinzj
 * @since v4.0.1
 */
@Configuration
@EnableConfigurationProperties(TestProperty.class)
public class TestConfiguration {

    @Resource
    private TestProperty testProperty;

    @Bean
    public TestBean getBean() {
        System.out.println(testProperty.getUrl());
        return new TestBean();
    }
}
