package com.weg.Atividade_Crud.Dto.Requisicao;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class FuncionarioRequisicaoDto {

    private String nome;
    private Long assentoId;
    private List<Long> projetosIds;
}
