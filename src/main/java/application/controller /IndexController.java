package application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Corrigido de @RequestController para @RestController
public class IndexController {
    @GetMapping("/")
    public String home() {
        return "Home - GET"; // Corrigido o retorno da string
    }

    @PostMapping("/")
    public String homePost() {
        return "home - POST";
    }
}