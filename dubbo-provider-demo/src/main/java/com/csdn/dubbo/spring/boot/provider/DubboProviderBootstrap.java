package com.csdn.dubbo.spring.boot.provider;

import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.PropertySource;

/**
 * @author ：xwf
 * @date ：Created in 2020\8\4 0004 16:48
 */
@EnableAutoConfiguration
@PropertySource("classpath:/dubbo.properties")
@DubboComponentScan(basePackages = "com.csdn.dubbo.spring.boot.provider")
public class DubboProviderBootstrap {
    public static void main(String[] args) {
        new SpringApplicationBuilder(DubboProviderBootstrap.class).web(WebApplicationType.SERVLET)
                .profiles("dubbo.scan.base-packages=com.csdn.dubbo.spring.boot.provider")
                .run(args);
    }
}
