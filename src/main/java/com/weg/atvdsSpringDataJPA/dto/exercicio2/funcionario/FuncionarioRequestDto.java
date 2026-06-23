package com.weg.atvdsSpringDataJPA.dto.exercicio2.funcionario;

import com.weg.atvdsSpringDataJPA.dto.exercicio2.endereco.EnderecoRequestDto;

public record FuncionarioRequestDto(
    String nome,
    EnderecoRequestDto endereco
) {

}
