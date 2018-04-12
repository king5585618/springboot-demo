package com.saxon.springbootdemo.service.impl;

import com.saxon.springbootdemo.service.ListService;

/**
 * @author jinzj
 * @since v4.0.1
 */
public class LinuxListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
