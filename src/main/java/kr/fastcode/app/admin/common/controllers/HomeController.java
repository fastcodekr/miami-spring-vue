package kr.fastcode.app.admin.common.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/hello")
    public String helloWorld() {
        return "hello!";
    }
}
