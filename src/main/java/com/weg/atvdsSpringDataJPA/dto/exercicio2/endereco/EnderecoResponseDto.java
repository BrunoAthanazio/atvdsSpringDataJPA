package com.weg.atvdsSpringDataJPA.dto.exercicio2.endereco;

import com.weg.atvdsSpringDataJPA.dto.exercicio2.funcionario.FuncionarioResponseDto;

public record EnderecoResponseDto(
    Long id,
    String rua,
    int numero,
    FuncionarioResponseDto funcionarioResponseDto
) {

}
