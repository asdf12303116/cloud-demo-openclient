package com.wantocode.clientopenfeign.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Chen
 * @date 2021/1/30
 */
@FeignClient("service-info-cluster")
public interface OpenFeignClient {
    @GetMapping("/getInfo")
    public String getInfo();
}
