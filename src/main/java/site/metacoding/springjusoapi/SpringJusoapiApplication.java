package site.metacoding.springjusoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringJusoapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJusoapiApplication.class, args);
	}

}
