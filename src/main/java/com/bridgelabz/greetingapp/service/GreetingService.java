package com.bridgelabz.greetingapp.service;


import com.bridgelabz.greetingapp.entity.Greeting;
import com.bridgelabz.greetingapp.entity.User;
import com.bridgelabz.greetingapp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService implements IGreetingService{
    @Autowired
    private GreetingRepository repository;

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Override
    public Greeting addGreeting(User user) {
       String messaage = String.format(template,(user.toString().isEmpty()) ? "Hello World": user.toString());
        return repository.save(new Greeting(counter.incrementAndGet(),messaage));
    }
}