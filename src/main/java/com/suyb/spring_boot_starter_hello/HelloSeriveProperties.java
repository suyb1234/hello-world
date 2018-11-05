package com.suyb.spring_boot_starter_hello;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by apple on 2018/1/26.
 */
@ConfigurationProperties(prefix = "hello")
public class HelloSeriveProperties {

    private static final String MSG = "world" ;

    private String msg = MSG ;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
