package com.cursomc.cursomc.repositories;

import com.cursomc.cursomc.domain.Categoria;
import com.cursomc.cursomc.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
    //objeto para realizar operacoes de acesso aos dados do objeto categoria


}
