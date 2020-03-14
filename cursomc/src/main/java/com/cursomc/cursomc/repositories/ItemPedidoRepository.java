package com.cursomc.cursomc.repositories;

import com.cursomc.cursomc.domain.Endereco;
import com.cursomc.cursomc.domain.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {
    //objeto para realizar operacoes de acesso aos dados do objeto categoria


}
