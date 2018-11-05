package com.suyb.spring_boot_starter_hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by apple on 2018/1/26.
 */
@Configuration
@EnableConfigurationProperties(HelloSeriveProperties.class)
@ConditionalOnClass(HelloService.class)
@ConditionalOnProperty(prefix = "hello" , value = "enabled" , matchIfMissing = true)

public class HelloServiceAutoConfiguration {

    @Autowired
    private HelloSeriveProperties helloSeriveProperties ;

    @Bean
    @ConditionalOnMissingBean(HelloService.class)
    public HelloService helloService () {
        HelloService helloService = new HelloService() ;
        helloService.setMsg(helloSeriveProperties.getMsg()) ;
        return helloService ;
    }
}
