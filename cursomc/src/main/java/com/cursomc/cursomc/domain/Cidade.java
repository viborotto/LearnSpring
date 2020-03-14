package com.cursomc.cursomc.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    //como saber de que lado fica o Join???
    @ManyToOne
    @JoinColumn(name = "estado_id") //chave estrangeira na cidade
    private Estado estado;

//    @OneToMany(mappedBy = "cidade")
//    private List<Endereco> enderecos = new ArrayList<>();

    public Cidade() {
    }

    public Cidade(Integer id, String nome, Estado estado) {
        this.id = id;
        this.nome = nome;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
