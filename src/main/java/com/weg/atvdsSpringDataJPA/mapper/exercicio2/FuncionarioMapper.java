package com.weg.atvdsSpringDataJPA.mapper.exercicio2;

import org.springframework.stereotype.Component;

import com.weg.atvdsSpringDataJPA.dto.exercicio2.funcionario.FuncionarioRequestDto;
import com.weg.atvdsSpringDataJPA.dto.exercicio2.funcionario.FuncionarioResponseDto;
import com.weg.atvdsSpringDataJPA.model.exercicio2.Endereco;
import com.weg.atvdsSpringDataJPA.model.exercicio2.Funcionario;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class FuncionarioMapper {

    private final EnderecoMapper enderecoMapper;

    public Funcionario toEntity(FuncionarioRequestDto dto){
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(dto.nome());
        if (dto.endereco() != null) {
            funcionario.setNome(dto.nome());
            Endereco endereco = enderecoMapper.toEntity(dto.endereco());
            endereco.setFuncionario(funcionario);
            funcionario.setEndereco(endereco);
        }
        return funcionario;
    }

    public FuncionarioResponseDto toResponse(Funcionario funcionario){
        return new FuncionarioResponseDto(funcionario.getId(),
        funcionario.getNome(),
        enderecoMapper.toResponse(funcionario.getEndereco()));
    }
}
