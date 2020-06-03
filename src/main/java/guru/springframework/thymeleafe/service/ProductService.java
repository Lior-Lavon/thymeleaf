package guru.springframework.thymeleafe.service;

import guru.springframework.thymeleafe.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> listProducts();

    Product getProduct(Long id);
}
