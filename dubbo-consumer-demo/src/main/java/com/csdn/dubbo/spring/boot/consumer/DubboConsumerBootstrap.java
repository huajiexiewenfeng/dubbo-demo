package com.csdn.dubbo.spring.boot.consumer;

import com.csdn.dubbo.spring.boot.api.EchoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：xwf
 * @date ：Created in 2020\8\4 0004 21:36
 */
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.csdn.dubbo.spring.boot.consumer")
public class DubboConsumerBootstrap {

    public static void main(String[] args) {
        new SpringApplicationBuilder(DubboConsumerBootstrap.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }

}
