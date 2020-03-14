package com.cursomc.cursomc.repositories;

import com.cursomc.cursomc.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
    //objeto para realizar operacoes de acesso aos dados do objeto categoria


}
