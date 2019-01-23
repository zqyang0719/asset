package com.ces.erp.assetmanagement.biz.controller;

import com.ces.erp.annotation.CustomLogger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(@RequestParam("name") String name){
        return "index";
    }

    @RequestMapping("/{url}")
    @CustomLogger
    public String toPage(@PathVariable String url){
        return url;
    }
}
