package com.cursomc.cursomc.service;

import com.cursomc.cursomc.domain.Categoria;
import com.cursomc.cursomc.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    //chamar o repository para servir o GET
    public Categoria buscar(Integer id){
        Optional<Categoria> categoria = categoriaRepository.findById(id);
        return categoria.orElse(null);
    }
}
