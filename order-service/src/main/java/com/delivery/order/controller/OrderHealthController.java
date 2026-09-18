package com.delivery.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class OrderHealthController {

    @GetMapping("/health")
    public String health(){
        return "order service is running";
    }
}
