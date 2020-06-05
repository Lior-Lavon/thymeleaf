package guru.springframework.thymeleafe.controller;

import guru.springframework.thymeleafe.api.v1.module.CheckoutDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class CheckoutController {

    @GetMapping("/checkout")
    public String checkoutForm(Model model){
        model.addAttribute("checkoutDTO", new CheckoutDTO());
        return "checkoutform";
    }

    @PostMapping("/checkout")
    public String doCheckout(@Valid CheckoutDTO checkoutDTO, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "checkoutform";
        }

        return "checkoutcomplete";
    }
}
