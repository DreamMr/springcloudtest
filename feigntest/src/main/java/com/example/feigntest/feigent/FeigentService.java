package com.example.feigntest.feigent;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "hi")
public interface FeigentService {
    @RequestMapping(value = "hi")
    String callHi(@RequestParam("name")String name);
}
