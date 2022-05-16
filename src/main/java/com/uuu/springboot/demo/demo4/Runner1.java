package com.uuu.springboot.demo.demo4;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Runner1 implements CommandLineRunner {
    @Autowired
    private BeverageRepository repository;

    @Override
    public void run(String... args) throws Exception {
        fillBeverage();
    }

    private void fillBeverage() {
        repository.save(new Beverage("Hot Coffee", "With Milk"));
        repository.save(new Beverage("Hot Coffee", "No Milk"));
        repository.save(new Beverage("Ice Coffee", "With Milk"));
        repository.save(new Beverage("Ice Coffee", "No Milk"));
        repository.save(new Beverage("Hot Green Tea", "With Milk"));
        repository.save(new Beverage("Hot Green Tea", "No Milk"));
        repository.save(new Beverage("Hot Red Tea", "With Milk"));
        repository.save(new Beverage("Hot Red Tea", "No Milk"));

    }
}