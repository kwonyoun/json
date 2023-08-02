package com.example.json.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.JsonObject;

@Controller
public class JsonController {

    @ResponseBody
    @RequestMapping("/JsonController")
    public String test3(){

        //객체class를 만들지 않고 직접 JSON을 만들어 값을 보내야 할 때
        //gradle -> build.gradle 의 dependencies에 코드 추가
        JsonObject obj =new JsonObject();

        obj.addProperty("title", "테스트3");
        obj.addProperty("content", "테스트3 내용");
        obj.addProperty("apple", "사과");

        JsonObject data = new JsonObject();

        data.addProperty("time", "12:00");

        obj.add("data", data);

        return obj.toString();
    }
    
}
