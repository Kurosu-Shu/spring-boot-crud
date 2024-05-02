package dev.sithuhtet.runnerz;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloWorldController {

    @GetMapping("")
    public String index() {
        return "Hello Sithu this is your first Spring Boot";
    }

}
