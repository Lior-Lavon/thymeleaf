package guru.springframework.thymeleafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringSecurityDemoController {

    @GetMapping("/secured")
    public String getSecurityDemo(){

        return "spring-security-info";
    }
}
