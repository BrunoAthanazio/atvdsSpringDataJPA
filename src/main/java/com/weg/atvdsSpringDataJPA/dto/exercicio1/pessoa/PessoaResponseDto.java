package com.weg.atvdsSpringDataJPA.dto.exercicio1.pessoa;

import com.weg.atvdsSpringDataJPA.dto.exercicio1.documento.DocumentoResponseDto;

public record PessoaResponseDto(
    Long id,
    String nome,
    DocumentoResponseDto documento
) {
    
}
