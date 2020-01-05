package com.example.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);


    @GetMapping("/")
    public String home(){
        LOG.info("开始愉快的玩耍吧");
        return "user home";
    }

    @GetMapping("/user/show")
    public String show(@RequestParam("id") String id){
        return "show"+id;
    }
}