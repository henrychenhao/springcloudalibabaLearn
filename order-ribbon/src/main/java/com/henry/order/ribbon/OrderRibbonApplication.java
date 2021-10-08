package com.henry.order.ribbon;

import com.henry.order.config.RibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author hao.chen
 * @date 2021/9/27 10:32 上午
 */
@SpringBootApplication
//@RibbonClients(value = {
//        @RibbonClient(name = "stock-nacos",configuration = RibbonConfig.class)
//})
public class OrderRibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderRibbonApplication.class,args);
    }


    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        RestTemplate restTemplate = builder.build();
        return restTemplate;
    }
}
