package org.vertexprize.git.connector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class GitConnectorApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitConnectorApplication.class, args);
	}

}
