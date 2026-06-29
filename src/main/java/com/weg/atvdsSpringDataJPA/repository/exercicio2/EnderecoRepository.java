package com.weg.atvdsSpringDataJPA.repository.exercicio2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.weg.atvdsSpringDataJPA.model.exercicio2.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository <Endereco, Long>{

}
