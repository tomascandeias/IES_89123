package ies.tc.randomquotes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class RandomQuotesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RandomQuotesApplication.class, args);
	}

}
