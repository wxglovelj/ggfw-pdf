package com.neuqsoft.ggfw.pdf;

import com.neuqsoft.commons.spring.cache.EnableReidsCache;
import com.neuqsoft.commons.spring.druid.EnableDruidConfig;
import com.neuqsoft.commons.spring.exception.handler.EnableGlobalException;
import com.neuqsoft.commons.spring.restful.RestTemplate406;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@EnableDruidConfig
@EnableReidsCache
@EnableGlobalException
@SpringBootApplication
public class GgfwPdfApplication {
    @Bean
    RestTemplate restTemplate() {
        return RestTemplate406.build("GGFW", "内部服务器错误，请稍后再试");
    }

    public static void main(String[] args) {
        SpringApplication.run(GgfwPdfApplication.class, args);
    }

}
