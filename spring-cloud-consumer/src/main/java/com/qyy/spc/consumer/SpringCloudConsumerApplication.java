package com.qyy.spc.consumer;

import com.qyy.spc.consumer.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableFeignClients
@RestController
public class SpringCloudConsumerApplication {

    @Autowired
    private ProviderService providerService;
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsumerApplication.class, args);
    }

    @GetMapping("{id}")
    public String consumerTest(@PathVariable(value = "id",required = true) Integer id){
        return providerService.test(id);
    }

}
