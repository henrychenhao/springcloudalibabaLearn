package com.henry.order.ribbon.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hao.chen
 * @date 2021/10/8 9:49 上午
 */
@FeignClient(name = "product-service",path = "/product")
public interface ProductFeignService {
    /**
     * 声明feign接口
     * @param id
     * @return
     */
    @RequestMapping("/{id}")
    String get(@PathVariable(value = "id") Integer id);
}
