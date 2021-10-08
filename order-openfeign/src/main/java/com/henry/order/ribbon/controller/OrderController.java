package com.henry.order.ribbon.controller;

import com.henry.order.ribbon.feign.StockFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author hao.chen
 * @date 2021/9/27 10:26 上午
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    StockFeignService stockFeignService;

    @RequestMapping("/add")
    public String add(){
        System.out.println("下单成功～～");
        String msg = stockFeignService.deduct();
        return "hello openfeign "+msg;
    }
}
