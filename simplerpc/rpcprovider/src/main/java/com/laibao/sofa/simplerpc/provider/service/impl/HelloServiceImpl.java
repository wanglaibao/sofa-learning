package com.laibao.sofa.simplerpc.provider.service.impl;

import com.laibao.sofa.simplerpc.provider.service.HelloService;

/**
 * @author laibao wang
 * @date 2018-08-12
 * @version 1.0
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String string) {
        System.out.println("Server receive: " + string);
        return "hello " + string + " ！";
    }
}
