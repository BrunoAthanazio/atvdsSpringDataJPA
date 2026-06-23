package com.weg.atvdsSpringDataJPA.controller.exercicio1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weg.atvdsSpringDataJPA.dto.exercicio1.pessoa.PessoaRequestDto;
import com.weg.atvdsSpringDataJPA.dto.exercicio1.pessoa.PessoaResponseDto;
import com.weg.atvdsSpringDataJPA.service.exercicio1.pessoa.PessoaService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/pessoas")
@RequiredArgsConstructor
public class PessoaController {

    private final PessoaService service;

    @PostMapping
    public PessoaResponseDto postPessoa(@RequestBody PessoaRequestDto dto){
        try{
            return service.save(dto);
        }catch(RuntimeException e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @GetMapping("/{id}")
    public PessoaResponseDto getPessoa(@PathVariable Long id){
        try{
            return service.findById(id);
        }catch(RuntimeException e){
            throw new RuntimeException(e.getMessage());
        }
    }
}
