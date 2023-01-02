package com.mehmetnuri.springbootelasticsearchlogdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@Slf4j
public class TestController {

    @GetMapping("/")
    public String HomePage(){
        LocalDateTime localDateTime = LocalDateTime.now();
        log.info("Demo Info Log " + localDateTime);
        log.warn("Demo Warn Log " + localDateTime);
        log.error("Demo Error Log " + localDateTime);
        log.debug("Demo Debug Log " + localDateTime);
        return "Please return  kibana page and check logs";
    }
}
