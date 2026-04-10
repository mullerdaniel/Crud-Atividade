package com.weg.Atividade_Crud.repository;

import com.weg.Atividade_Crud.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
