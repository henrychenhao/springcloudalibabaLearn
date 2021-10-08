package com.henry.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author hao.chen
 * @date 2021/9/27 10:32 上午
 */
@SpringBootApplication
@EnableFeignClients
public class OrderOpenFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderOpenFeignApplication.class,args);
    }
}
