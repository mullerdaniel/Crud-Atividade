package com.weg.Atividade_Crud.Dto.Resposta;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProjetoRespostaDto {

    private Long id;
    private String nome;
    private List<String> funcionarios;
}
