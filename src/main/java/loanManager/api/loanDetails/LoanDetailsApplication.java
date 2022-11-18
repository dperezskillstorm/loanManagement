package loanManager.api.loanDetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class LoanDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanDetailsApplication.class, args);
	}
	
	

}
