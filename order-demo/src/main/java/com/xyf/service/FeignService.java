package com.xyf.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "xyf-user")
public interface FeignService {

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    String getUser(@PathVariable("id") int id);
}
