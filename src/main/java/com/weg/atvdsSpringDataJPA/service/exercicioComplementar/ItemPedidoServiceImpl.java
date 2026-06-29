package com.weg.atvdsSpringDataJPA.service.exercicioComplementar;

import java.util.List;

import org.springframework.stereotype.Service;

import com.weg.atvdsSpringDataJPA.dto.exercicioComplementar.itemPedido.ItemPedidoRequestDto;
import com.weg.atvdsSpringDataJPA.dto.exercicioComplementar.itemPedido.ItemPedidoResponseDto;
import com.weg.atvdsSpringDataJPA.dto.exercicioComplementar.pedido.PedidoRequestDto;
import com.weg.atvdsSpringDataJPA.mapper.exercicioComplementar.ItemPedidoMapper;
import com.weg.atvdsSpringDataJPA.model.exercicioComplementar.ItemPedido;
import com.weg.atvdsSpringDataJPA.model.exercicioComplementar.Pedido;
import com.weg.atvdsSpringDataJPA.repository.exercicioComplementar.ItemPedidoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ItemPedidoServiceImpl implements ItemPedidoService{

    private final ItemPedidoMapper mapper;
    private final ItemPedidoRepository repository;

    @Override
    public ItemPedidoResponseDto save(ItemPedidoRequestDto dto) {
        if(dto.pedido() != null){
            ItemPedido itemPedido = mapper.toEntity(dto);
            
        }
    }

    @Override
    public List<ItemPedidoResponseDto> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public ItemPedidoResponseDto fundById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fundById'");
    }

    @Override
    public void update(PedidoRequestDto pedidoRequestDto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
