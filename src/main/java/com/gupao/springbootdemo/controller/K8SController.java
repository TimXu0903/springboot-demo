package com.gupao.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;

@RestController
public class K8SController {


    @RequestMapping("/k8s")
    public String k8s(){
        return "Hi Tim, this is testing K8s <br/>v03";
    }
}
