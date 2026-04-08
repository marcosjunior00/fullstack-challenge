package br.com.marcosjunior.crud_usuarios;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/teste")
@RestController
public class PrimeiraController {

    @GetMapping("/ola")
    public String teste() {
        return "Olá, mundo!";
    }

}