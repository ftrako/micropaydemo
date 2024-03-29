package com.example.nacoscentersrv.controller.api;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 主页
 *
 * @author cdj
 * @version 1.0 2022-10-26 15:27
 **/
@RestController
@RequestMapping("/v1/nacoscentersrv")
public class IndexController {
    private static final Logger logger = LogManager.getLogger(IndexController.class);

    @Value("${server.port}")
    private String port;

    @GetMapping("")
    public String index() {
        return "ok";
    }
}
