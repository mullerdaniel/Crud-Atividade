package com.weg.Atividade_Crud.mapper;

import com.weg.Atividade_Crud.Dto.Resposta.ProjetoRespostaDto;
import com.weg.Atividade_Crud.model.Projeto;

import java.util.stream.Collectors;

public class ProjetoMapper {

    public static ProjetoRespostaDto toDto(Projeto projeto) {
        ProjetoRespostaDto dto = new ProjetoRespostaDto();

        dto.setId(projeto.getId());
        dto.setNome(projeto.getNome());

        dto.setFuncionarios(
                projeto.getFuncionarios()
                        .stream()
                        .map(funcionario -> funcionario.getNome())
                        .collect(Collectors.toList())
        );

        return dto;
    }
}
