package dev;

public class get {
    package com.example.hello.controller;

import com.example.hello.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.Map;

@RestController // 해당 class 는 REST API를 처리하는 컨트롤러
@RequestMapping("/api") // uri를 저장해주는 어노테이션

public class Apicontroller {

    @GetMapping("/hello") ///http://localhost:8080/api/hello 로 url 설정 GET방식으로 넘어오면 해당 정보를 넘겨준다.
    public String hello(){
        return "hello spring boot";
    }
    @GetMapping("/path-variable/{mj}")
    public String pathVariable(@PathVariable(name = "mj") String pathname){
        System.out.println("PathVariable : " + pathname );
        return  pathname;
    }
    @GetMapping(path = "query-param")
    public String queryParam(@RequestParam  Map<String, String> queryParam) {
        StringBuilder sb = new StringBuilder();
        queryParam.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            sb.append(entry.getKey() + " = " + entry.getValue() + "\n");
        });
        return "";
    }
    @GetMapping(path = "query-param02")
    public String queryParam02(@RequestParam String name, @RequestParam String email, @RequestParam int age) {
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);
        return "";
    }
    // 객체로 맵핑해서 알아서 해당 값을 매칭하여 받도록 한다. (매우중요)
    @GetMapping(path = "query-param03")
    public String queryParam03(UserRequest userRequest) {
        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());
        return userRequest.toString();
    }

}
}
