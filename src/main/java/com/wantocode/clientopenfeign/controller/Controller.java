package com.wantocode.clientopenfeign.controller;

import com.wantocode.clientopenfeign.api.OpenFeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Chen
 * @date 2021/1/30
 */
@RestController
public class Controller {

    @Resource
    private OpenFeignClient openFeignClient;

    @GetMapping("/getInfo")
    public String test(){
        StringBuffer stringBuffer= new StringBuffer();
        stringBuffer.append("[");
        stringBuffer.append(openFeignClient.getInfo());
        stringBuffer.append(",");
        stringBuffer.append(openFeignClient.getInfo());
        stringBuffer.append(",");
        stringBuffer.append(openFeignClient.getInfo());
        stringBuffer.append(",");
        stringBuffer.append(openFeignClient.getInfo());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
