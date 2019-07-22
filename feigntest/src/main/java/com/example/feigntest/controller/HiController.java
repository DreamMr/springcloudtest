package com.example.feigntest.controller;

import com.example.feigntest.feigent.FeigentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Autowired
    FeigentService feigentService;

    @RequestMapping("hi")
    String callFeigen(@RequestParam("name")String name){
        String response = feigentService.callHi(name);
        return response;
    }
}
