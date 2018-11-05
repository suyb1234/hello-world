package com.suyb.spring_boot_starter_hello;

/**
 * Created by apple on 2018/1/26.
 */
public class HelloService {

    private String msg ;

    public String sayHello () {
        return "Hello" + msg ;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
