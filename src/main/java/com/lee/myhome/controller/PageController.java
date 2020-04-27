package com.lee.myhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author limingren@sinoSoft.com.cn
 * @date 2020/1/29 16:16
 */
@Controller
public class PageController {

    @GetMapping("/")
    public String getHome(){

        return "index";
    }

}
