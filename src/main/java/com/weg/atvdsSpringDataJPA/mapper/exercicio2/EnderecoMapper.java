package com.weg.atvdsSpringDataJPA.mapper.exercicio2;

import org.springframework.stereotype.Component;

import com.weg.atvdsSpringDataJPA.dto.exercicio2.endereco.EnderecoRequestDto;
import com.weg.atvdsSpringDataJPA.dto.exercicio2.endereco.EnderecoResponseDto;
import com.weg.atvdsSpringDataJPA.model.exercicio2.Endereco;

@Component
public class EnderecoMapper {

    public Endereco toEntity(EnderecoRequestDto dto){
        return new Endereco(
            dto.rua(),
            dto.numero());
    }

    public EnderecoResponseDto toResponse(Endereco endereco){
        return new EnderecoResponseDto(
            endereco.getId(),
            endereco.getRua(),
            endereco.getNumero());
    }
}
