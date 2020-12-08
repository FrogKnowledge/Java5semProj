package by.belstu.stankevich;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.security.NoSuchAlgorithmException;


@SpringBootApplication
@EnableJpaRepositories
public class StankevichApplication {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        SpringApplication.run(StankevichApplication.class, args);
    }

}
