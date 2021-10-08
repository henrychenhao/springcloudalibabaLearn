package com.henry.order.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author hao.chen
 * @date 2021/9/27 10:26 上午
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/add")
    public String add(){
        System.out.println("下单成功～～");
        String msg = restTemplate.getForObject("http://localhost:8011/stock/deduct", String.class);
        return "hello world spring cloud alibaba "+msg;
    }
}
