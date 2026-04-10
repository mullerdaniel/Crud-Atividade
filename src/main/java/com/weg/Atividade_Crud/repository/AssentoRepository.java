package com.weg.Atividade_Crud.repository;

import com.weg.Atividade_Crud.model.Assento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.ScopedValue;

public interface AssentoRepository extends JpaRepository<Assento, Long> {
    ScopedValue<Object> findById();
}
