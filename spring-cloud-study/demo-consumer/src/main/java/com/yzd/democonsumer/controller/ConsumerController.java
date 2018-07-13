package com.yzd.democonsumer.controller;

import brave.SpanCustomizer;
import com.yzd.democonsumer.remote.HelloRemote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.annotation.NewSpan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    HelloRemote helloRemote;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        t();
        this.customizer.name("test1").tag("step02","124");
        this.customizer.tag("step03","124");
        logger.error("1111==========1111");
        return helloRemote.hello(name);
    }
    @Autowired
    SpanCustomizer customizer;
    @NewSpan
    public void t(){
        this.customizer.name("test").tag("step01","124");
        logger.info("t");
    }
}
