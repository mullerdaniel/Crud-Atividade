package com.weg.Atividade_Crud.Dto.Requisicao;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProjetoRequisicaoDto {

    private String nome;
    private List<Long> funcionariosIds;
}
