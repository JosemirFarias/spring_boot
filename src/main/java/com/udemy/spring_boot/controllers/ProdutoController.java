package com.udemy.spring_boot.controllers;

import com.udemy.spring_boot.model.entities.Produto;
import com.udemy.spring_boot.model.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public Produto novoProduto(@RequestParam String nome) {
        Produto produto = new Produto(nome);
        produtoRepository.save(produto);
        return produto;
    }
}
