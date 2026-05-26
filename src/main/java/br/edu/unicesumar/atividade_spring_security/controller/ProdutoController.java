package br.edu.unicesumar.atividade_spring_security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<ProdutoModel> listarProdutos(){
        produtoService.listAll();
    }

    @PostMapping
    public ProdutoModel criar(ProdutoModel produto){
        produtoService.save(produto);
    }
}
