package com.henry.order.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hao.chen
 * @date 2021/9/28 5:46 下午
 */
@Configuration
public class RibbonConfig {

    @Bean
    public IRule iRule(){
        return new RandomRule();
    }
}
