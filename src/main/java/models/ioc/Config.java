package models.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//When constructing a Company, use this Bean
@ComponentScan(basePackageClasses = Company.class)

public class Config {
    @Bean
    public Address getAddress(){
        return new Address("High Street", 1000);
    }

    @Bean
    public String getName(){
        return "Tom's Hardware";
    }
}
