package com.cursomc.cursomc.repositories;

import com.cursomc.cursomc.domain.Cidade;
import com.cursomc.cursomc.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    //objeto para realizar operacoes de acesso aos dados do objeto categoria


}
