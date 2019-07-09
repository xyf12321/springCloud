package com.xyf.controller;

import com.xyf.service.FeignService;
import com.xyf.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @Autowired
    FeignService feignService;

    @RequestMapping("/order")
    public String addOrder(String name,int id){
        String result=orderService.getUser(id);

        return "商品:"+name+",生成订单:"+result;
    }

    @RequestMapping("/order2")
    public String addOrder2(String name,int id){
        String result=feignService.getUser(id);

        return "商品:"+name+",生成订单:"+result;
    }
}
