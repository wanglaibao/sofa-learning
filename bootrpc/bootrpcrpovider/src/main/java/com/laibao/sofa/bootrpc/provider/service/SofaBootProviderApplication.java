package com.laibao.sofa.bootrpc.provider.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author laibao wang
 * @date 2018-08-13
 * @version 1.0
 */

public class SofaBootProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SofaBootProviderConfiguration.class, args);
    }
}
