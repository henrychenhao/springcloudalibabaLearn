package com.henry.stock.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hao.chen
 * @date 2021/9/27 10:30 上午
 */
@RestController
@RequestMapping("/stock")
public class StockController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/deduct")
    public String deduct(){
        System.out.println("库存扣减成功～～"+port);
        return "库存扣减成功～～"+port;
    }
}
