package guru.springframework.thymeleafe.service;

import guru.springframework.thymeleafe.api.v1.mapper.ProductMapper;
import guru.springframework.thymeleafe.api.v1.module.ProductDTO;
import guru.springframework.thymeleafe.domain.Product;
import guru.springframework.thymeleafe.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductServiceImpl(ProductMapper productMapper, ProductRepository productRepository) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }


    @Override
    public List<ProductDTO> listProducts() {
        return productRepository.findAll()
                .stream()
                .map(product -> {
                    ProductDTO productDTO = productMapper.productToProductDTO(product);
                    return productDTO;
                }).collect(Collectors.toList());
    }

    @Override
    public ProductDTO getProduct(Long id) {
        Optional<Product> productOptional = productRepository.findById(id);
        if(productOptional.isPresent()){
            ProductDTO productDTO = productMapper.productToProductDTO(productOptional.get());
            return productDTO;
        }else {
            throw new RuntimeException("Product not found : " + id);
        }
    }
}
