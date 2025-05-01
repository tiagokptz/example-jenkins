package br.edu.catolica.example_jenkins.service;

import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public void valid(String name) {
        if(Strings.isBlank(name)) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
    }
}
