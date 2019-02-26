package cn.com.springcloudtest.cloud.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 网关服务启动入口
 * @author qxs
 * @date 2017-06-09
 * **/
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class ApiGatewayServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayServerApplication.class, args);
    }
}
