package com.saxon.springbootdemo.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author jinzj
 * @since v4.0.1
 */
@Getter
@Setter
public class ErrorInfo<T> {

    public static final Integer OK = 200;
    public static final Integer ERROR = 500;

    private Integer code;
    private String message;
    private String url;
    private T data;
}
