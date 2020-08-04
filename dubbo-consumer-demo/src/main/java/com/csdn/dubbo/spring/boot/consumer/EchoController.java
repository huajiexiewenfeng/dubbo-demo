package com.csdn.dubbo.spring.boot.consumer;

import com.csdn.dubbo.spring.boot.api.EchoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：xwf
 * @date ：Created in 2020\8\4 0004 22:23
 */
@RestController
public class EchoController {

    @Reference(version = "1.0.0", url = "dubbo://127.0.0.1:12345")
    private EchoService service;

    @GetMapping("/echo")
    public String echo(@RequestParam String message) {
        return service.echo(message);
    }
}
