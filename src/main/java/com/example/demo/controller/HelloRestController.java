package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    // curl localhost:8080/hello -w "\n"
    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello from BridgeLabz";
    }    

    // curl localhost:8080/hello/query?name=Manali -w "\n"
    // curl -X GET "http://localhost:8080/hello/query/?fName=Manali&lName=Parab" -w "\n"
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "fName") String fName, @RequestParam(value = "lName") String lName) {
        return "Hello " + fName + " " + lName + " !";
    }   


}
