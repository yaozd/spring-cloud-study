package com.yzd.democonsumer.remote;

import org.springframework.stereotype.Component;

@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello(String name) {
        return "HelloRemoteHystrix";
    }
}
