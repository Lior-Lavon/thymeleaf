package guru.springframework.thymeleafe.repository;

import guru.springframework.thymeleafe.domain.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {

    ProductCategory findProductCategoriesByCategory(String category);
}
