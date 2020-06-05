package guru.springframework.thymeleafe.api.v1.mapper;

import guru.springframework.thymeleafe.api.v1.module.AuthorDTO;
import guru.springframework.thymeleafe.api.v1.module.ProductDTO;
import guru.springframework.thymeleafe.domain.Author;
import guru.springframework.thymeleafe.domain.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthorMapper {

    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    AuthorDTO authorToAuthorDTO(Author author);
    Author authorDTODToAuthor(AuthorDTO authorDTO);
}
