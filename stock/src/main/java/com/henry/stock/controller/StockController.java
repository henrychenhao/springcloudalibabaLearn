package com.henry.stock.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hao.chen
 * @date 2021/9/27 10:30 上午
 */
@RestController
@RequestMapping("/stock")
public class StockController {
    @RequestMapping("/deduct")
    public String deduct(){
        System.out.println("库存扣减成功～～");
        return "库存扣减成功～～";
    }
}
