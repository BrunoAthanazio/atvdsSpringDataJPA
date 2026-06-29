package com.weg.atvdsSpringDataJPA.service.exercicio2;

import org.springframework.stereotype.Service;

import com.weg.atvdsSpringDataJPA.dto.exercicio2.funcionario.FuncionarioRequestDto;
import com.weg.atvdsSpringDataJPA.dto.exercicio2.funcionario.FuncionarioResponseDto;
import com.weg.atvdsSpringDataJPA.mapper.exercicio2.FuncionarioMapper;
import com.weg.atvdsSpringDataJPA.model.exercicio2.Funcionario;
import com.weg.atvdsSpringDataJPA.repository.exercicio2.FuncionarioRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FuncionarioServiceImpl implements FuncionarioService{

    private final FuncionarioRepository repository;
    private final FuncionarioMapper mapper;

    @Override
    public FuncionarioResponseDto save(FuncionarioRequestDto dto) {
        if(dto.endereco() == null){
            throw new RuntimeException("Endereço inválido para cadastro");
        }
        Funcionario funcionario = mapper.toEntity(dto);
        repository.save(funcionario);
        return mapper.toResponse(funcionario);
    }

    @Override
    public FuncionarioResponseDto findById(Long id) {
        Funcionario funcionario = repository.findById(id).orElseThrow(() -> new RuntimeException("Funcionario não encontrado"));
        return mapper.toResponse(funcionario);
    }

}
