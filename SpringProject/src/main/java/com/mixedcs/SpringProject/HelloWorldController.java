package com.mixedcs.SpringProject;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @PostMapping("/world")
    public String helloPost(@RequestBody String name){

        return "Hello Post! " + name + "!";
    }
}
