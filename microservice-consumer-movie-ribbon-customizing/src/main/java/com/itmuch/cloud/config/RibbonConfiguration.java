package com.itmuch.cloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Ribbon的配置类
 * 注意：该类不应该在主应用程序上下文的@ComponentScan 中。
 * User: monkey
 * Date: 2018-11-07 18:27
 */
@Configuration
public class RibbonConfiguration {

    //自定义负载均衡规则
    @Bean
    public IRule ribbonRule(){
        // 负载均衡规则，改为随机，默认轮询
        return new RandomRule();
    }

}
