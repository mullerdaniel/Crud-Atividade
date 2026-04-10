package com.weg.Atividade_Crud.Dto.Requisicao;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AssentoRequisicaoDto {
    private String nome;
    private Long assentoId;
    private List<Long> projetoIds;
}
