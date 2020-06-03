package guru.springframework.thymeleafe.bootstrap;

import guru.springframework.thymeleafe.domain.Author;
import guru.springframework.thymeleafe.domain.Product;
import guru.springframework.thymeleafe.domain.ProductCategory;
import guru.springframework.thymeleafe.repository.AuthorRepository;
import guru.springframework.thymeleafe.repository.ProductCategoryRepository;
import guru.springframework.thymeleafe.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Component
public class LoadData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final ProductCategoryRepository productCategoryRepository;
    private final ProductRepository productRepository;

    public LoadData(AuthorRepository authorRepository, ProductCategoryRepository productCategoryRepository, ProductRepository productRepository) {
        this.authorRepository = authorRepository;
        this.productCategoryRepository = productCategoryRepository;
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        LoadAuthor();
        LoadProductCategory();
        LoadProduct();
    }

    private void LoadAuthor(){

        Author author1 = Author.builder().firstName("John").lastName("Thompson").image("instructor_jt.jpg").build();

        authorRepository.save(author1);

        log.debug("LoadAuthor : " + authorRepository.count());
    }

    private void LoadProductCategory(){

        ProductCategory pc1 = ProductCategory.builder().category("Spring introduction").build();
        ProductCategory pc2 = ProductCategory.builder().category("Spring Core").build();
        ProductCategory pc3 = ProductCategory.builder().category("Spring Boot").build();
        ProductCategory pc4 = ProductCategory.builder().category("Thymeleaf").build();
        ProductCategory pc5 = ProductCategory.builder().category("G.E.A.P").build();

        productCategoryRepository.save(pc1);
        productCategoryRepository.save(pc2);
        productCategoryRepository.save(pc3);
        productCategoryRepository.save(pc4);
        productCategoryRepository.save(pc5);

        log.debug("LoadProductCategory : " + productCategoryRepository.count());
    }

    private void LoadProduct(){

        Author jt = authorRepository.findAuthorByFirstName("John");
        ProductCategory springIntroCat = productCategoryRepository.findProductCategoriesByCategory("Spring introduction");
        ProductCategory springCoreCat = productCategoryRepository.findProductCategoriesByCategory("Spring Core");
        ProductCategory springBootCat = productCategoryRepository.findProductCategoriesByCategory("Spring Boot");
        ProductCategory thymeleafCat = productCategoryRepository.findProductCategoriesByCategory("Thymeleaf");
        ProductCategory geapCat = productCategoryRepository.findProductCategoriesByCategory("G.E.A.P");

        Product springIntro = new Product();
        springIntro.setCourseName("Introduction to Spring");
        springIntro.setCourseSubtitle("Start Learning Spring!");
        springIntro.setAuthor(jt);
        springIntro.setCourseDescription("Why would you want to learn about the Spring Framework? Simple, Spring is the most widely used framework in the enterprise today. Major companies all over the world are hiring programmers who know the Spring Framework.\n");
        springIntro.setPrice(new BigDecimal("0"));
        springIntro.setImageUrl("SpringIntroThumb.png");
        springIntro.getProductCategories().add(springIntroCat);
        springIntro.getProductCategories().add(springBootCat);
        productRepository.save(springIntro);

        Product springCoreUltimate = new Product();
        springCoreUltimate.setCourseName("Spring Core Ultimate");
        springCoreUltimate.setCourseSubtitle("Ultimate Bundle of Spring Core!");
        springCoreUltimate.setAuthor(jt);
        springCoreUltimate.setCourseDescription("Why would you want to learn about the Spring Framework? Simple, Spring is the most widely used framework in the enterprise today. Major companies all over the world are hiring programmers who know the Spring Framework.");
        springCoreUltimate.setPrice(new BigDecimal("199"));
        springCoreUltimate.setImageUrl("SpringCoreUltimateThumb.png");
        springCoreUltimate.getProductCategories().add(springCoreCat);
        springCoreUltimate.getProductCategories().add(springBootCat);
        productRepository.save(springCoreUltimate);

        Product thymeleaf = new Product();
        thymeleaf.setCourseName("Thymeleaf");
        thymeleaf.setCourseSubtitle("Thymeleaf and Spring!");
        thymeleaf.setAuthor(jt);
        thymeleaf.setCourseDescription("Why would you want to learn about the Spring Framework? Simple, Spring is the most widely used framework in the enterprise today. Major companies all over the world are hiring programmers who know the Spring Framework.");
        thymeleaf.setPrice(new BigDecimal("199"));
        thymeleaf.setImageUrl("ThymeleafThumb.png");
        thymeleaf.getProductCategories().add(thymeleafCat);
        productRepository.save(thymeleaf);

        Product springCore = new Product();
        springCore.setCourseName("Spring Core");
        springCore.setCourseSubtitle("Spring Core - mastering Spring!");
        springCore.setAuthor(jt);
        springCore.setCourseDescription("Why would you want to learn about the Spring Framework? Simple, Spring is the most widely used framework in the enterprise today. Major companies all over the world are hiring programmers who know the Spring Framework.");
        springCore.setPrice(new BigDecimal("199"));
        springCore.setImageUrl("SpringCoreThumb.png");
        springCore.getProductCategories().add(springCoreCat);
        springCore.getProductCategories().add(springBootCat);
        productRepository.save(springCore);

        Product springCoreAdv = new Product();
        springCoreAdv.setCourseName("Spring Core Advanced");
        springCoreAdv.setCourseSubtitle("Advanced Spring Core!");
        springCoreAdv.setAuthor(jt);
        springCoreAdv.setCourseDescription("Why would you want to learn about the Spring Framework? Simple, Spring is the most widely used framework in the enterprise today. Major companies all over the world are hiring programmers who know the Spring Framework.");
        springCoreAdv.setPrice(new BigDecimal("199"));
        springCoreAdv.setImageUrl("SpringCoreAdvancedThumb.png");
        springCoreAdv.getProductCategories().add(springCoreCat);
        springCoreAdv.getProductCategories().add(springBootCat);
        productRepository.save(springCoreAdv);

        Product springCoreDevOps = new Product();
        springCoreDevOps.setCourseName("Spring Core Dev-Ops");
        springCoreDevOps.setCourseSubtitle("Deploying Spring in the Enterprise and the cloud!");
        springCoreDevOps.setAuthor(jt);
        springCoreDevOps.setCourseDescription("Why would you want to learn about the Spring Framework? Simple, Spring is the most widely used framework in the enterprise today. Major companies all over the world are hiring programmers who know the Spring Framework.");
        springCoreDevOps.setPrice(new BigDecimal("199"));
        springCoreDevOps.setImageUrl("SpringCoreDevOpsThumb.png");
        springCoreDevOps.getProductCategories().add(springCoreCat);
        springCoreDevOps.getProductCategories().add(springBootCat);
        productRepository.save(springCoreDevOps);

        log.debug("LoadProduct : " + productRepository.count());
    }


}
