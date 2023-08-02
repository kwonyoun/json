package com.example.json.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.json.vo.TestVO;

@RestController
public class TestRestController {

    @RequestMapping("/TestRestController")
    public TestVO test1(){

        TestVO vo = new TestVO();

        vo.setTitle("RestController");
        vo.setContent("RequestMapping");

        return vo;

    }
    
}
