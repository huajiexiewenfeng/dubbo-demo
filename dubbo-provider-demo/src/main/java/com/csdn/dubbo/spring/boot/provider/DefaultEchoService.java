package com.csdn.dubbo.spring.boot.provider;

import com.csdn.dubbo.spring.boot.api.EchoService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "${echo.service.version}")
public class DefaultEchoService implements EchoService {
    public String echo(String message) {
        return "Echo:" + message;
    }
}