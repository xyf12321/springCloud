package com.xyf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {
    @Autowired
    RestTemplate restTemplate;

    public String getUser(int id){

        String url="http://xyf-user/user/{id}";

        String info=restTemplate.getForObject(url,String.class,id);
        return info;
    }

}
