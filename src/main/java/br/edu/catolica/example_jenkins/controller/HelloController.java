package br.edu.catolica.example_jenkins.controller;

import br.edu.catolica.example_jenkins.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/{name}")
    public String helloUser(@PathVariable("name") String name) {
        helloService.valid(name);
        return "Seja bem-vindo(a) " + name;
    }
}
