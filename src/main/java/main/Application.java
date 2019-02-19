package main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@ComponentScan(basePackages = {"controllers"})
@SpringBootApplication

public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    /**
     * When there is an interface witha single method, it can be implemented with a Lambda.
     * public interface CommandLineRunner {
     *     void run(String... args) throws Exception;
     * }
     * This is a Fn to println all beans in the current context, prior to the application starting.
     * This same action may be performed defining a @Component class implementing the CommandLineRunner interface, and
     * overriding the run method.
     */
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }


}
