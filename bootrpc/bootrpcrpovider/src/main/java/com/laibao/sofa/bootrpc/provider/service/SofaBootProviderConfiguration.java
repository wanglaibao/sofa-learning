package com.laibao.sofa.bootrpc.provider.service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author laibao wang
 * @date 2018-08-13
 * @version 1.0
 */
@ImportResource({"classpath*:META-INF/spring/rpc-sofa-boot-provider.xml" })
@SpringBootApplication
public class SofaBootProviderConfiguration {
}
