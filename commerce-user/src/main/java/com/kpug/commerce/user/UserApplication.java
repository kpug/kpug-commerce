package com.kpug.commerce.user;

import com.kpug.commerce.user.domain.customer.Customer;
import com.kpug.commerce.user.domain.customer.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableEurekaClient
@Slf4j
@EnableJpaAuditing
@EntityScan(
        basePackageClasses = {Jsr310JpaConverters.class},
        basePackages = {"com.kpug.commerce.user.domain"}
)
public class UserApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }

    @Autowired
    CustomerRepository repository;

    @Override
    public void run(String... args) throws Exception {
        log.info("Hello World");
        Customer customer = new Customer();
        customer.setLast("last");
        customer.setFirst("first");
        repository.save(customer);
    }
}
