package guru.springframework.thymeleafe.controller;

import guru.springframework.thymeleafe.repository.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private final ProductRepository productRepository;

    public IndexController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping({"", "/", "/index"})
    public String getIndex(Model model) {
        model.addAttribute("products", productRepository.findAll());
        return "/index";
    }

}
