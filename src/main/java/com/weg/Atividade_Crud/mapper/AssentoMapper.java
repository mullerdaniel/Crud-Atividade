package com.weg.Atividade_Crud.mapper;

import com.weg.Atividade_Crud.Dto.Resposta.FuncionarioRespostaDto;
import com.weg.Atividade_Crud.model.Funcionario;

import java.util.stream.Collectors;

public class AssentoMapper {

    public static FuncionarioRespostaDto toDto(Funcionario funcionario) {
        FuncionarioRespostaDto dto = new FuncionarioRespostaDto();

        dto.setId(funcionario.getId());
        dto.setNome(funcionario.getNome());

        if(funcionario.getAssento() != null) {
            dto.setCodigoAssento(funcionario.getAssento().getCodigo());
        }


        dto.setProjetos(
                funcionario.getProjetos()
                        .stream()
                        .map(p -> p.getNome())
                        .collect(Collectors.toList())
        );

        return dto;

    }
}
