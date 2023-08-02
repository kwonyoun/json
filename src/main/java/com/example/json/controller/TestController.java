package com.example.json.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.json.vo.TestVO;

@Controller
public class TestController {

    @ResponseBody
    @RequestMapping("/TestController")
    public TestVO test2(){

        TestVO vo = new TestVO();

        vo.setTitle("Controller");
        vo.setContent("ResponseBody + RequestMapping");

        return vo;

    }
}
