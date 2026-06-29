package com.weg.atvdsSpringDataJPA.model.exercicioComplementar;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "pedido")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Pedido {

    private Long id;

    private LocalDate dataCriacao;

    private String nomeCliente;

    @OneToMany(mappedBy = "pedido")
    private List<ItemPedido> itens;

    public Pedido(LocalDate dataCriacao, String nomeCliente) {
        this.dataCriacao = dataCriacao;
        this.nomeCliente = nomeCliente;
    }
}
