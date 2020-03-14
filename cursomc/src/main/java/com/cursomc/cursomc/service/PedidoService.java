package com.cursomc.cursomc.service;

import com.cursomc.cursomc.domain.Cliente;
import com.cursomc.cursomc.domain.Pedido;
import com.cursomc.cursomc.exceptions.CategoriaNotFoundException;
import com.cursomc.cursomc.repositories.ClienteRepository;
import com.cursomc.cursomc.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    //chamar o repository para servir o GET
    public Pedido buscar(Integer id) {

        Optional<Pedido> obj = pedidoRepository.findById(id);

        return obj.orElseThrow(() -> new CategoriaNotFoundException("Pedido nao encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
    }
}
