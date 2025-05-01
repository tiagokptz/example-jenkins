package br.edu.catolica.example_jenkins.serive;

import br.edu.catolica.example_jenkins.service.HelloService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloServiceTest {
    @Autowired
    HelloService helloService;

    @Test
    void testValidName() {
       String name = "Lucas";
        Assertions.assertDoesNotThrow(() -> helloService.valid(name));
    }

    @Test
    void testInvalidName() {
       String name = "";
       helloService.valid(name);
    }
}
