package guru.springframework.thymeleafe.service;

import guru.springframework.thymeleafe.api.v1.module.ProductDTO;
import guru.springframework.thymeleafe.domain.Product;

import java.util.List;

public interface ProductService {

    List<ProductDTO> listProducts();

    ProductDTO getProduct(Long id);
}
