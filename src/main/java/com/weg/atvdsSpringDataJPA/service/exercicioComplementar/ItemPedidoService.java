package com.weg.atvdsSpringDataJPA.service.exercicioComplementar;

import java.util.List;

import com.weg.atvdsSpringDataJPA.dto.exercicioComplementar.itemPedido.ItemPedidoRequestDto;
import com.weg.atvdsSpringDataJPA.dto.exercicioComplementar.itemPedido.ItemPedidoResponseDto;
import com.weg.atvdsSpringDataJPA.dto.exercicioComplementar.pedido.PedidoRequestDto;

public interface ItemPedidoService {
    ItemPedidoResponseDto save(ItemPedidoRequestDto dto);

    List<ItemPedidoResponseDto> findAll();

    ItemPedidoResponseDto fundById(Long id);

    void update(PedidoRequestDto pedidoRequestDto);

    void delete(Long id);
}
