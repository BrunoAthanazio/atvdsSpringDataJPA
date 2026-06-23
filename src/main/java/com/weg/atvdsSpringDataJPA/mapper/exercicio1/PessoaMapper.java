package com.weg.atvdsSpringDataJPA.mapper.exercicio1;

import org.springframework.stereotype.Component;

import com.weg.atvdsSpringDataJPA.dto.exercicio1.pessoa.PessoaRequestDto;
import com.weg.atvdsSpringDataJPA.dto.exercicio1.pessoa.PessoaResponseDto;
import com.weg.atvdsSpringDataJPA.model.exercicio1.Pessoa;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PessoaMapper {

    private final DocumentoMapper mapper;

    public Pessoa toEntity(PessoaRequestDto requestDto){
        return new Pessoa(requestDto.nome(), requestDto.documento() != null ? mapper.toEntity(requestDto.documento()) : null);
    }

    public PessoaResponseDto toResponse(Pessoa pessoa){
        return new PessoaResponseDto(pessoa.getId(), pessoa.getNome(), pessoa.getDocumento() != null ? mapper.toResponse(pessoa.getDocumento()) : null);
    }
}
