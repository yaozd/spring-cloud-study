package com.yzd.democonsumer.remote;

import com.yzd.democonsumer.config.RedditFeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by summer on 2017/5/11.
 */
@FeignClient(name= "P1", configuration = RedditFeignConfiguration.class ,fallback =HelloRemoteHystrix.class )
public interface HelloRemote {

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);

}
