package guru.springframework.thymeleafe.api.v1.module;

import guru.springframework.thymeleafe.domain.Author;
import guru.springframework.thymeleafe.domain.ProductCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

    private Long id;

    private String courseName;

    private String courseSubtitle;

    private String courseDescription;

    private AuthorDTO author;

    private BigDecimal price;

    private List<ProductCategory> productCategories = new ArrayList<>();

    private String imageUrl;
}
