package com.yzd.democonsumer.config;

import com.netflix.loadbalancer.BestAvailableRule;
import com.netflix.loadbalancer.IRule;
import feign.Logger;
import feign.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedditFeignConfiguration {
    public static final int FIVE_SECONDS = 30000;
    @Bean
    public Logger.Level feignLogger() {
        return Logger.Level.FULL;
    }
    //超时时间
    @Bean
    public Request.Options options() {
        return new Request.Options(FIVE_SECONDS, FIVE_SECONDS);
    }
    //（并发量）
    @Bean
    public IRule ribbonRule() {
        return new BestAvailableRule();
    }

}
