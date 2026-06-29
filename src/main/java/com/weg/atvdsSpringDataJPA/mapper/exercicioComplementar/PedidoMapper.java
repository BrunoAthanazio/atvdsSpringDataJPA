package com.weg.atvdsSpringDataJPA.mapper.exercicioComplementar;

import org.springframework.stereotype.Component;

import com.weg.atvdsSpringDataJPA.dto.exercicioComplementar.pedido.PedidoRequestDto;
import com.weg.atvdsSpringDataJPA.dto.exercicioComplementar.pedido.PedidoResponseDto;
import com.weg.atvdsSpringDataJPA.model.exercicioComplementar.Pedido;

@Component
public class PedidoMapper {

    public Pedido toEntity(PedidoRequestDto dto){
        return new Pedido(
            dto.dataCriacao(),
            dto.nomeCliente());
    }

    public PedidoResponseDto toResponse(Pedido pedido){
        return new PedidoResponseDto(
            pedido.getId(),
            pedido.getDataCriacao(),
            pedido.getNomeCliente());
    }

}
