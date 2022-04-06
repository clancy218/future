package com.clancy.future.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The beauty of Java programming
 *
 * @Auther: clancy
 * @Date: 2022/03/28  17:00
 * @Name: HomeController
 * @Version: v1.0
 * @Description:
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping(value = "/")
    public String indexPage(){
        return "index";
    }


    public String getData(){
        return null;
    }
}
