package com.kodnest.app;

import io.github.cdimascio.dotenv.Dotenv;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EnvConfig {

    @PostConstruct
    public void loadEnv() {
        Dotenv dotenv = Dotenv.load();

        // Set values as system properties so Spring can read them
        System.setProperty("API_KEY", dotenv.get("API_KEY"));
        System.setProperty("SECRET_KEY", dotenv.get("SECRET_KEY"));
    }
}
