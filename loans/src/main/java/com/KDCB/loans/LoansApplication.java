package com.KDCB.loans;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.eazybytes.loans.controller") })
@EnableJpaRepositories("com.eazybytes.loans.repository")
@EntityScan("com.eazybytes.loans.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Loans microservice REST API Documentation",
				description = "KDCB Loans microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Sree",
						email = "Sree@codestak.com",
						url = "https://www.github/Sree26-10.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.github/Sree26-10.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "KDCB Loans microservice REST API Documentation",
				url = "https://www.github/Sree26-10.com"
		)
)
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}
}