package com.yzd.democonsumer.controller;

import com.yzd.democonsumer.remote.HelloRemote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
        logger.error("1111==========1111");
        return helloRemote.hello(name);
    }

}
