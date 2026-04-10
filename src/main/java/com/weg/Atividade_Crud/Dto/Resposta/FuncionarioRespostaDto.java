package com.weg.Atividade_Crud.Dto.Resposta;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class FuncionarioRespostaDto {

    private Long id;
    private String nome;
    private String codigoAssento;
    private List<String> projetos;
}
