package com.tlyong1024.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author tangly
 */
@Controller
@RequestMapping("/hello")
public class TestController {

    @RequestMapping(value="/foo", produces = "text/html; charset=utf-8")
    public @ResponseBody String getShopInJSON(HttpServletRequest request) {
        System.out.println(request);
        return "你好";
    }

}
