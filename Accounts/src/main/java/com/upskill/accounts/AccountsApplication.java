package com.upskill.accounts;

import com.upskill.accounts.dto.ResponseDto;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(info = @Info(title = "Accounts API", version = "1.0",contact = @Contact(name = "KDCB@Help", email = "support@kdcb.com"),license = @License(name = "Apache 2.0", url = "https://www.apache.org/licenses/LICENSE-2.0"), description = "Accounts Microservices REST APIS"))
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);

	}



}
