package guru.springframework.thymeleafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

    @GetMapping("/product")
    public String getProduct(Model model) {
        return "/product";
    }

}
