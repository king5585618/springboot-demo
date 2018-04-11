package com.saxon.springbootdemo.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author jinzj
 * @since v4.0.1
 */
@Component
public class MyTestRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("11111111");
    }
}
