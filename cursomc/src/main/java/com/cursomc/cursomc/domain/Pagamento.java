package com.cursomc.cursomc.domain;

import com.cursomc.cursomc.domain.enums.EstadoPagamento;

import javax.persistence.*;

@Entity
public class Pagamento {

    //tem que ter mesmo id que o pedido
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private EstadoPagamento estado;

    @OneToOne
    @JoinColumn(name = "pedido_id")//em um lado eu coloco o Join e no outro mappedBy
    @MapsId
    private Pedido pedido;

    public Pagamento(){}

    public Pagamento(Integer id, EstadoPagamento estado, Pedido pedido) {
        this.id = id;
        this.estado = estado;
        this.pedido = pedido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public EstadoPagamento getEstado() {
        return estado;
    }

    public void setEstado(EstadoPagamento estado) {
        this.estado = estado;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
