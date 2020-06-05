package guru.springframework.thymeleafe.api.v1.module;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginDTO {

    @NotEmpty
//    @Size(min=2 , max = 8)
    private String username;

    @NotEmpty
//    @Size(min=2 , max = 8)
    private String password;
}
