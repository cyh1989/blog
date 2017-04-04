package com.example.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Tiger on 2017/4/4.
 */
@Controller
@EnableAutoConfiguration
public class HelloSpringBoot {

    @RequestMapping(value="/",method = RequestMethod.GET)
    public  String index(){
        return "index";
    }


}
