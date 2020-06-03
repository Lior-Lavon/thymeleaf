package guru.springframework.thymeleafe.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "course_subtitle")
    private String courseSubtitle;

    @Column(name = "course_description")
    private String courseDescription;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    @Column(name = "price")
    private BigDecimal price;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<ProductCategory> productCategories = new ArrayList<>();

    @Column(name = "image_url")
    private String imageUrl;

}
