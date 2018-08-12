package com.laibao.sofa.simplerpc.consumer;

import com.alipay.sofa.rpc.config.ConsumerConfig;
import com.laibao.sofa.simplerpc.provider.service.HelloService;

/**
 * @author laibao wang
 * @date 2018-08-12
 * @version 1.0
 */
public class SimpleRpcConsumer {
    public static void main(String[] args) {
        ConsumerConfig<HelloService> consumerConfig = new ConsumerConfig<HelloService>();
        // 指定接口
        consumerConfig.setInterfaceId(HelloService.class.getName());
        // 指定协议
        consumerConfig.setProtocol("bolt");
        // 指定直连地址
        consumerConfig.setDirectUrl("bolt://127.0.0.1:12200");

        // 生成代理类
        HelloService helloService = consumerConfig.refer();
        while (true) {
            System.out.println(helloService.sayHello("world"));
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        }
    }
}
