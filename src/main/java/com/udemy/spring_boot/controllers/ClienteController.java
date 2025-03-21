package com.udemy.spring_boot.controllers;

import com.udemy.spring_boot.model.entities.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ClienteController {

   @GetMapping(path = "cliente/qualquer")
    public Cliente obterCliente() {

       return new Cliente(1, "Josemir", "123,456,789-10");
    }
}
