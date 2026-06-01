package br.edu.unicesumar.atividade_spring_security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Usado para retornar um JSON automaticamente
@RequestMapping("/produtos") //Usado para definir a rota
public class ProdutoController {

    @Autowired //Permite a injeção de classes
    private ProdutoService produtoService;

    @GetMapping//Usado para buscar/listar
    public List<ProdutoModel> listarProdutos(){

        return produtoService.listAll();
    }

    @PostMapping//Serve para criação de recursos
    public ProdutoModel criar(ProdutoModel produto){

        return produtoService.save(produto);
    }
}
