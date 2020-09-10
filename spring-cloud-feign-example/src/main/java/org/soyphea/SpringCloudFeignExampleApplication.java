package org.soyphea;

import org.soyphea.client.BookClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class SpringCloudFeignExampleApplication {

	private final BookClient bookClient;

	public SpringCloudFeignExampleApplication(BookClient bookClient) {
		this.bookClient = bookClient;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFeignExampleApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(){
		return args -> {
			System.out.println(bookClient.getBookBySbn("123"));
			System.out.println(bookClient.allBooks());
			System.out.println(bookClient.addNewBook(new Book("Clean Architecture",90,"1456")));
		};
	}

}
