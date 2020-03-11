package com.cursomc.cursomc.repositories;

import com.cursomc.cursomc.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
    //objeto para realizar operacoes de acesso aos dados do objeto categoria


}
