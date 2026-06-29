package com.weg.atvdsSpringDataJPA.dto.exercicioComplementar.pedido;

import java.time.LocalDate;

public record PedidoRequestDto (
    LocalDate dataCriacao,
    String nomeCliente
){
    
}
