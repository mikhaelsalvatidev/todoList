package br.com.mikhaelsalvati.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
//http://localhost:8080/ ------ 
public class MinhaPrimeiraController {

    
    /**
     * METODO DE ACESSO AO HTTP
     * GET      -   Buscar informação
     * POST     -   Adicionar dado/informação
     * PUT      -   Alterar dado/informação
     * DELETE   -   Deletar dado/informação
     * PATCH    -   Alterar somente uma parte do dado/informação
     * 
     */

//Metodo de uma classe
    @GetMapping("/primeiroMetodo")
    public String primeiraMensagem(){
        return "Funcionou!";
    }
    
}