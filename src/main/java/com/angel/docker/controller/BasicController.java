package com.angel.docker.controller;

import com.angel.docker.service.BasicService;

import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jbhunt.requestmetric.annotation.RequestMetric;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
@RequestMetric
@RequiredArgsConstructor
public class BasicController {

    private final BasicService basicService;

    @Timed(value = "response.time", description = "time taken to return current time", histogram = true )
    @GetMapping(value="/currentDateTime")
    public String getCurrentDateTime() throws InterruptedException {
        log.info("returning date");

        return basicService.getCurrentDateTime();
    }
    
}
