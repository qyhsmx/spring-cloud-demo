package com.qyy.spc.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author qyhsmx@outlook.com
 * @date
 */
@Service
@FeignClient("spring-cloud-provider")
@RequestMapping("provider")
public interface ProviderService {

    @GetMapping("/{id}")
    String test(@PathVariable Integer id);
}
