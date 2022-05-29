package com.NaSSIB.HelloAngularSpring.HelloAngularSpring;

import java.util.stream.Stream;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.NaSSIB.HelloAngularSpring.HelloAngularSpring.entity.User;
import com.NaSSIB.HelloAngularSpring.HelloAngularSpring.repo.UserRepository;

@SpringBootApplication
public class HelloAngularSpringApplication {

  public static void main(String[] args) {
    SpringApplication.run(HelloAngularSpringApplication.class, args);
  }

  @Bean
  CommandLineRunner init(UserRepository userRepository) {
    return args -> {
      Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
        User user = new User(name, name.toLowerCase() + "@domain.com");
        userRepository.save(user);
      });
      userRepository.findAll().forEach(System.out::println);
    };
  }

}
