package com.weg.Atividade_Crud.repository;

import com.weg.Atividade_Crud.model.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
}
