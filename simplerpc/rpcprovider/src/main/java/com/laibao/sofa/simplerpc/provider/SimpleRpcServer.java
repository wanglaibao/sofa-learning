package com.laibao.sofa.simplerpc.provider;

import com.alipay.sofa.rpc.config.ProviderConfig;
import com.alipay.sofa.rpc.config.ServerConfig;
import com.laibao.sofa.simplerpc.provider.service.HelloService;
import com.laibao.sofa.simplerpc.provider.service.impl.HelloServiceImpl;

/**
 * @author laibao wang
 * @date 2018-08-12
 * @version 1.0
 */
public class SimpleRpcServer {
    public static void main(String[] args) {
        ServerConfig serverConfig = new ServerConfig();
        // 设置一个协议，默认bolt
        serverConfig.setProtocol("bolt");
        // 设置一个端口，默认12200
        serverConfig.setPort(12200);
        // 非守护线程
        serverConfig.setDaemon(false);

        ProviderConfig<HelloService> providerConfig = new ProviderConfig<HelloService>();
        // 指定接口
        providerConfig.setInterfaceId(HelloService.class.getName());
        // 指定实现
        providerConfig.setRef(new HelloServiceImpl());
        // 指定服务端
        providerConfig.setServer(serverConfig);
        // 发布服务
        providerConfig.export();
    }
}
