package com.weg.atvdsSpringDataJPA.dto.exercicio2.funcionario;

import com.weg.atvdsSpringDataJPA.dto.exercicio2.endereco.EnderecoResponseDto;

public record FuncionarioResponseDto(
    Long id,
    String nome,
    EnderecoResponseDto endereco
) {

}
