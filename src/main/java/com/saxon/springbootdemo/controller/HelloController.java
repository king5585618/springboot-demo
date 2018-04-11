package com.saxon.springbootdemo.controller;

import com.saxon.springbootdemo.exception.CommonException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jinzj
 * @since v4.0.1
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @RequestMapping("/index")
    public String index(ModelMap map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://blog.didispace.com");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "index";
    }

    @RequestMapping("/getError")
    public String error() throws Exception {
        throw new Exception("错误");
    }

    @RequestMapping("/getError2")
    public String json() throws CommonException {
        throw new CommonException("发生错误2");
    }
}
