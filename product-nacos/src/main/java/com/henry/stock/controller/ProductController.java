package com.henry.stock.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hao.chen
 * @date 2021/9/27 10:30 上午
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/{id}")
    public String get(@PathVariable Integer id){
        System.out.println("查询商品信息～～ID："+id+"端口："+port);
        return "查询商品信息成功～～"+port;
    }
}
