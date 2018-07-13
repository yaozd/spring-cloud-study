package com.yzd.demoproducer.controller;

import brave.SpanCustomizer;
import brave.Tracing;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.sleuth.annotation.NewSpan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    Tracing tracing;
    @Autowired
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
/*        tracing = Tracing.newBuilder()
                .localServiceName("my-service")
                .spanReporter(spanReporter)
                .build();

        // 跟踪公开的可能需要的对象，最重要的时跟踪
        tracer = tracing.tracer();

// Failing to close resources can result in dropped spans! When tracing is no
// longer needed, close the components you made in reverse order. This might be
// a shutdown hook for some users.
        tracing.close();
        spanReporter.close();
        sender.close();
        logger.info("product");*/
        t();
        return "端口：" + port+ ";hello "+name+"，this is first messge";
    }
    @Autowired
    SpanCustomizer customizer;
    @NewSpan
    public void t(){
        this.customizer.name("test").tag("gud","124");
        logger.info("t");
    }
}
