package com.weg.atvdsSpringDataJPA.service.exercicio1.pessoa;

import com.weg.atvdsSpringDataJPA.dto.exercicio1.pessoa.PessoaRequestDto;
import com.weg.atvdsSpringDataJPA.dto.exercicio1.pessoa.PessoaResponseDto;

public interface PessoaService {

    PessoaResponseDto save(PessoaRequestDto dto);

    PessoaResponseDto findById(Long id);
}
