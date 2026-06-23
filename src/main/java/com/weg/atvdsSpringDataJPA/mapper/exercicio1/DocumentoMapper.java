package com.weg.atvdsSpringDataJPA.mapper.exercicio1;

import org.springframework.stereotype.Component;

import com.weg.atvdsSpringDataJPA.dto.exercicio1.documento.DocumentoRequestDto;
import com.weg.atvdsSpringDataJPA.dto.exercicio1.documento.DocumentoResponseDto;
import com.weg.atvdsSpringDataJPA.model.exercicio1.Documento;

@Component
public class DocumentoMapper {
    
    public Documento toEntity(DocumentoRequestDto requestDto){
        return new Documento(requestDto.numero(),requestDto.tipo());
    }

    public DocumentoResponseDto toResponse(Documento documento){
        return new DocumentoResponseDto(documento.getId(),documento.getNumero(),documento.getTipo());
    }
}
