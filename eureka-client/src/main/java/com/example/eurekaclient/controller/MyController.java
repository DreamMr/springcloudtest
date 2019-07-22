package com.example.eurekaclient.controller;

import com.example.eurekaclient.request.MyRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Value("${server.port}")
    String port;

    @RequestMapping(value = "hi")
    public String home(@RequestParam(value = "name",defaultValue = "wwb")String name){
        return name+" welcome !"+ " I come from port : "+port;
    }

    @RequestMapping(value = "jsonTest")
    public MyRequest content(@RequestBody MyRequest request){
        System.out.println(request);
        String con = request.getData();
        System.out.println(con);
        return request;
    }
}
