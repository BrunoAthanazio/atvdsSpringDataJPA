package com.weg.atvdsSpringDataJPA.repository.exercicio1;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weg.atvdsSpringDataJPA.model.exercicio1.Documento;

public interface DocumentoRepository extends JpaRepository<Documento, Long>{
    boolean existsByNumero(String numero);
}
