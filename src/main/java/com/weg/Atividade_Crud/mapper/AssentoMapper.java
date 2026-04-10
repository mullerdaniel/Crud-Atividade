package com.weg.Atividade_Crud.mapper;

import com.weg.Atividade_Crud.Dto.Resposta.AssentoRespostaDto;
import com.weg.Atividade_Crud.model.Assento;

public class AssentoMapper {

    public static AssentoRespostaDto toDto(Assento assento) {
        AssentoRespostaDto dto = new AssentoRespostaDto();

        dto.setId(assento.getId());
        dto.setCodigoAssento(assento.getCodigo());

        if(assento.getFuncionario() != null) {
            dto.setNome(assento.getFuncionario().getNome());
        }

        return dto;
    }
}
