package com.weg.atvdsSpringDataJPA.dto.exercicioComplementar.itemPedido;

import com.weg.atvdsSpringDataJPA.model.exercicioComplementar.Pedido;

public record ItemPedidoResponseDto(
    Long id,
    String nome,
    int preco,
    Pedido pedido
) {
    
}
