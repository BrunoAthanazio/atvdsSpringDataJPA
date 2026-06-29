package com.weg.atvdsSpringDataJPA.dto.exercicioComplementar.itemPedido;

import com.weg.atvdsSpringDataJPA.dto.exercicioComplementar.pedido.PedidoRequestDto;

public record ItemPedidoRequestDto(
    String nome,
    int preco,
    PedidoRequestDto pedido
) {

}
