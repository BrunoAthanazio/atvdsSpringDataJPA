package com.weg.atvdsSpringDataJPA.dto.exercicio1.pessoa;

import com.weg.atvdsSpringDataJPA.dto.exercicio1.documento.DocumentoRequestDto;

public record PessoaRequestDto(
    String nome,
    DocumentoRequestDto documento
) {

}
