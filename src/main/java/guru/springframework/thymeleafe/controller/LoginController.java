package guru.springframework.thymeleafe.controller;

import guru.springframework.thymeleafe.api.v1.module.LoginDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String getLoginForm(Model model){

        model.addAttribute("loginDTO", new LoginDTO());
        return "loginform";
    }

    @GetMapping("logout-success")
    public String youLoggedOut(){
        // redirected from SpringSecurityConfig.java
        return "logout-success";
    }

    @PostMapping("/login")
    public String login(BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "loginform";
        }

        return "redirect:/index";
    }
}
