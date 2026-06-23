package com.weg.atvdsSpringDataJPA.service.exercicio1.pessoa;

import org.springframework.stereotype.Service;

import com.weg.atvdsSpringDataJPA.dto.exercicio1.pessoa.PessoaRequestDto;
import com.weg.atvdsSpringDataJPA.dto.exercicio1.pessoa.PessoaResponseDto;
import com.weg.atvdsSpringDataJPA.mapper.exercicio1.PessoaMapper;
import com.weg.atvdsSpringDataJPA.model.exercicio1.Pessoa;
import com.weg.atvdsSpringDataJPA.repository.exercicio1.DocumentoRepository;
import com.weg.atvdsSpringDataJPA.repository.exercicio1.PessoaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PessoaServiceImpl implements PessoaService{

    private final PessoaMapper mapper;
    private final PessoaRepository pessoaRepository;
    private final DocumentoRepository documentoRepository;

    @Override
    public PessoaResponseDto save(PessoaRequestDto dto) {
        if(documentoRepository.existsByNumero(dto.documento().numero()) || pessoaRepository.existsByNome(dto.nome())){
            throw new RuntimeException("Pessoa já possui documento ou documento já foi cadastrado");
        }else{
            Pessoa pessoa = mapper.toEntity(dto);
            pessoaRepository.save(pessoa);
            return mapper.toResponse(pessoa);
        }
    }

    @Override
    public PessoaResponseDto findById(Long id) {
        Pessoa pessoa = pessoaRepository.findById(id).orElseThrow(() -> new RuntimeException("Pessoa não encontrada"));
        return mapper.toResponse(pessoa);
    }

}
