package com.laibao.sofa.bootrpc.provider.service.impl;

import com.laibao.sofa.bootrpc.provider.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author laibao wang
 * @date 2018-08-13
 * @version 1.0
 */
@Service("helloService")
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String string) {
        System.out.println("Server receive: " + string);
        return "hello " + string + " ！";
    }
}
