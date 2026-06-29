package com.weg.atvdsSpringDataJPA.model.exercicioComplementar;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "item_pedido")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ItemPedido {

    private Long id;

    private String nome;

    private int preco;

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;

    public ItemPedido(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
    }

    
}
