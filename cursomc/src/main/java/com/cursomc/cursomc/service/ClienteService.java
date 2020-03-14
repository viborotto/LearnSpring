package com.cursomc.cursomc.service;

import com.cursomc.cursomc.domain.Categoria;
import com.cursomc.cursomc.domain.Cliente;
import com.cursomc.cursomc.exceptions.CategoriaNotFoundException;
import com.cursomc.cursomc.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    //chamar o repository para servir o GET
    public Cliente buscar(Integer id) {

        Optional<Cliente> obj = clienteRepository.findById(id);

        return obj.orElseThrow(() -> new CategoriaNotFoundException("Clietne nao encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
    }
}




