package com.pprog.cledule.config;

import com.pprog.cledule.entities.User;
import com.pprog.cledule.enums.Role;
import com.pprog.cledule.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User("Pedro Paulo", Role.INSTRUCTOR, "pedro@gmail.com");
        User u2 = new User("Cecília Cerqueira", Role.DEPARTMENT_MANAGER, "cecilia@gmail.com");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
