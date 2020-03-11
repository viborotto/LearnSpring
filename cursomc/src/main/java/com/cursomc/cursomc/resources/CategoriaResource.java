package com.cursomc.cursomc.resources;

import com.cursomc.cursomc.domain.Categoria;
import com.cursomc.cursomc.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @Autowired
    private CategoriaService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id){
    //vai retornar uma lista de categorias

        Categoria obj = service.buscar(id);
        return ResponseEntity.ok().body(obj);
//        Categoria cat1 = new Categoria(1,"Informatica");
//        Categoria cat2 = new Categoria(2,"Escritorio");
//
//        List<Categoria> lista = new ArrayList<>();
//        lista.add(cat1);
//        lista.add(cat2);
//
//        return lista;
    }
}
