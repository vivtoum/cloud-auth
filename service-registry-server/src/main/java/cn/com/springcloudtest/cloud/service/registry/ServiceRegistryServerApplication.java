package cn.com.springcloudtest.cloud.service.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka服务微服务
 * @author qxs
 * @date 2017-06-12
 * **/
@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceRegistryServerApplication.class, args);
    }
}

