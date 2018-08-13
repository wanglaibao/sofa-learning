package com.laibao.sofa.bootrpc.consumer.service;

import com.laibao.sofa.bootrpc.provider.service.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author laibao
 * @date 2018-08-13
 * @version 1.0
 */
public class SofaBootConsumerApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(SofaBootConsumerConfiguration.class);
        ApplicationContext applicationContext = springApplication.run(args);
        HelloService helloService = applicationContext.getBean("helloService",HelloService.class);
        System.out.println(helloService.sayHello("金戈"));
    }
}
