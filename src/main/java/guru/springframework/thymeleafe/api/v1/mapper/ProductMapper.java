package guru.springframework.thymeleafe.api.v1.mapper;

import guru.springframework.thymeleafe.api.v1.module.ProductDTO;
import guru.springframework.thymeleafe.domain.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    ProductDTO productToProductDTO(Product product);
    Product productDTOToProduct(ProductDTO productDTO);
}
