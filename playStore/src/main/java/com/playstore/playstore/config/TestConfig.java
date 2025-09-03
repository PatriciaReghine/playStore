    package com.playstore.playstore.config;

    import com.playstore.playstore.entities.User;
    import com.playstore.playstore.repositories.UserRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.boot.CommandLineRunner;
    import org.springframework.context.annotation.Configuration;
    import org.springframework.context.annotation.Profile;

    import java.util.Arrays;

    @Configuration
    @Profile("test")
    public class TestConfig implements CommandLineRunner {
        @Override
        public void run(String... args) throws Exception {
            User u1 = new User( null, "Mateus Avila","mateus@gmail.com","043999283568","123456");
            User u2 = new User( null, "Maria Clara","maria@gmail.com","043999283588","123456");

            userRepository.saveAll(Arrays.asList(u1,u2));
        }
        @Autowired
        private UserRepository userRepository;


    }
