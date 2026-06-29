package com.weg.atvdsSpringDataJPA.service.exercicio2;

import com.weg.atvdsSpringDataJPA.dto.exercicio2.funcionario.FuncionarioRequestDto;
import com.weg.atvdsSpringDataJPA.dto.exercicio2.funcionario.FuncionarioResponseDto;

public interface FuncionarioService {

    FuncionarioResponseDto save(FuncionarioRequestDto dto);

    FuncionarioResponseDto findById(Long id);
}
