package com.henry.order.ribbon.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hao.chen
 * @date 2021/10/8 9:49 上午
 */
@FeignClient(name = "stock-service",path = "/stock")
public interface StockFeignService {
    /**
     * 声明feign接口
     * @return
     */
    @RequestMapping("/deduct")
    String deduct();
}
