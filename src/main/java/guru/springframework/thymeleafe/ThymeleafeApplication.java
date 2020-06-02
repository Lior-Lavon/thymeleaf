package guru.springframework.thymeleafe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

@SpringBootApplication
@ComponentScan(basePackages = {"guru.*"})
@EntityScan(basePackages = {"guru.*"})
@EnableJpaRepositories(basePackages = {"guru.*"})
public class ThymeleafeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThymeleafeApplication.class, args);
    }


}
