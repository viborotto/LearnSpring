package com.cursomc.cursomc.repositories;

import com.cursomc.cursomc.domain.Estado;
import com.cursomc.cursomc.domain.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {
    //objeto para realizar operacoes de acesso aos dados do objeto categoria


}
