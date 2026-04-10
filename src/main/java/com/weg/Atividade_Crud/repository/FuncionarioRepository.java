package com.weg.Atividade_Crud.repository;

import com.weg.Atividade_Crud.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
    List<Funcionario> findAllById(List<String> funcionarios);
}
