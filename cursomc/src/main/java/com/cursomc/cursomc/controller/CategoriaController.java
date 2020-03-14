package com.cursomc.cursomc.controller;

import com.cursomc.cursomc.domain.Categoria;
import com.cursomc.cursomc.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//ResponseEntity encapsula os dados de retorno
// represents the whole HTTP response: status code, headers, and body
//https://www.baeldung.com/spring-response-entity
@RestController
@RequestMapping(value = "/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id){
    //vai retornar uma lista de categorias

        Categoria categoria = categoriaService.buscar(id);
        return ResponseEntity.ok().body(categoria);
    }
}
