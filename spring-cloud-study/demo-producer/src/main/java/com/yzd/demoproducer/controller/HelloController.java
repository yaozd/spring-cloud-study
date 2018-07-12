package com.yzd.demoproducer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    String port;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
/*        try {
            Thread.sleep(9*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        logger.info("product");
        return "端口：" + port+ ";hello "+name+"，this is first messge";
    }
}
