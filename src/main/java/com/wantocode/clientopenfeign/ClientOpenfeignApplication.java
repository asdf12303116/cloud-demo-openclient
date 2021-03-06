package com.wantocode.clientopenfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author a6757
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class ClientOpenfeignApplication {

    public static void main(String[] args) {
        System.out.println("Test");
        SpringApplication.run(ClientOpenfeignApplication.class, args);
    }

}
