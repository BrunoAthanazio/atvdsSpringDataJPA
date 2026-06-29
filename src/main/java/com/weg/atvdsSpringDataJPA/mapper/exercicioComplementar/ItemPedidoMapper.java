package com.weg.atvdsSpringDataJPA.mapper.exercicioComplementar;

import org.springframework.stereotype.Component;

import com.weg.atvdsSpringDataJPA.dto.exercicioComplementar.itemPedido.ItemPedidoRequestDto;
import com.weg.atvdsSpringDataJPA.dto.exercicioComplementar.itemPedido.ItemPedidoResponseDto;
import com.weg.atvdsSpringDataJPA.model.exercicioComplementar.ItemPedido;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ItemPedidoMapper {

    private final PedidoMapper pedidoMapper;

    public ItemPedido toEntity(ItemPedidoRequestDto dto){
        ItemPedido itemPedido = new ItemPedido(dto.nome(),dto.preco());
        itemPedido.setPedido(pedidoMapper.toEntity(dto.pedido()));
        return itemPedido;
    }

    public ItemPedidoResponseDto toResponse(ItemPedido itemPedido){
        return new ItemPedidoResponseDto(
            itemPedido.getId(),
            itemPedido.getNome(),
            itemPedido.getPreco(),
            itemPedido.getPedido());
    }
}
