package com.weg.atvdsSpringDataJPA.dto.exercicioComplementar.pedido;

import java.time.LocalDate;

public record PedidoResponseDto(
    Long id,
    LocalDate dataCriacao,
    String nomeCliente
) {

}
