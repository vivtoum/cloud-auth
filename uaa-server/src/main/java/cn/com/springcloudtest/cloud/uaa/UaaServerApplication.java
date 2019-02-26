package cn.com.springcloudtest.cloud.uaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 认证微服务
 * @author qxs
 * @date 2017-06-12
 * **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableWebSecurity
@EnableRedisHttpSession
@EnableOAuth2Client
@EnableAuthorizationServer
public class UaaServerApplication extends WebMvcConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(UaaServerApplication.class, args);
	}

}
