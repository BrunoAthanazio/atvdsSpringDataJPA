package com.weg.atvdsSpringDataJPA.controller.exercicio2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weg.atvdsSpringDataJPA.dto.exercicio2.funcionario.FuncionarioRequestDto;
import com.weg.atvdsSpringDataJPA.dto.exercicio2.funcionario.FuncionarioResponseDto;
import com.weg.atvdsSpringDataJPA.service.exercicio2.FuncionarioServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/funcionarios")
public class FuncionarioController {

    private final FuncionarioServiceImpl service;

    @PostMapping
    public FuncionarioResponseDto postFuncionario(@RequestBody FuncionarioRequestDto dto){
        try{
            return service.save(dto);
        }catch(RuntimeException e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @GetMapping("/{id}")
    public FuncionarioResponseDto getFuncionario(@PathVariable Long id){
        try{
            return service.findById(id);
        }catch(RuntimeException e){
            throw new RuntimeException(e.getMessage());
        }
    }

}
