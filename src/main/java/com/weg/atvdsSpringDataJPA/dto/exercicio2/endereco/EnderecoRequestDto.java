package com.weg.atvdsSpringDataJPA.dto.exercicio2.endereco;

import com.weg.atvdsSpringDataJPA.dto.exercicio2.funcionario.FuncionarioRequestDto;

public record EnderecoRequestDto(
    String rua,
    int numero,
    FuncionarioRequestDto funcionario
) {

}
