package com.pyin.zhihu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginAndReg {

    @RequestMapping("/")
    @ResponseBody
    public String Hello(){
        return "hello";
    }

}
