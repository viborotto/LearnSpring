package com.cursomc.cursomc.controller;

import com.cursomc.cursomc.domain.Cliente;
import com.cursomc.cursomc.domain.Pedido;
import com.cursomc.cursomc.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id){

        Pedido pedido = pedidoService.buscar(id);
        return ResponseEntity.ok().body(pedido);
    }

}
