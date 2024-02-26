package com.platzi.market;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/holamundo")
public class HolaMundoController {
    @GetMapping("/saludo")
    public String Greetings() {
        return "Hola mundo desde java spring";
    }
}
