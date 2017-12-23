package org.springlearnproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLearnProjectApplication {

    public static void main(String[] args){
        SpringApplication springBootApplication = new SpringApplication(SpringLearnProjectApplication.class);
        springBootApplication.run(args);
    }

}
