package com.gabriel.loginapp;

import com.gabriel.loginapp.model.User;
import com.gabriel.loginapp.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class LoginappApplication {
	public static void main(String[] args) {
		SpringApplication.run(LoginappApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UserRepository repo) {
		return args -> {
			if (repo.findByUsername("gabas").isEmpty()) {
				User user = new User();
				user.setUsername("gabas");
				user.setPassword(new BCryptPasswordEncoder().encode("gabas69"));
				user.setRole("ROLE_USER");
				repo.save(user);
			}
		};
	}

}
