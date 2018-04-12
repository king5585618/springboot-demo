package com.saxon.springbootdemo.property;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author jinzj
 * @since v4.0.1
 */
@ConfigurationProperties(prefix = "test")
@Getter
@Setter
public class TestProperty {

    private String url ;
}
