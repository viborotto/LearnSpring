package com.cursomc.cursomc.service;

import com.cursomc.cursomc.domain.Categoria;
import com.cursomc.cursomc.exceptions.CategoriaNotFoundException;
import com.cursomc.cursomc.repositories.CategoriaRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    //chamar o repository para servir o GET
    public Categoria buscar(Integer id){

        Optional<Categoria> obj = categoriaRepository.findById(id);

            return obj.orElseThrow(() -> new CategoriaNotFoundException("Categoria nao encontrada! Id: "+ id+ ", Tipo: "+ Categoria.class.getName()));
    }
}




