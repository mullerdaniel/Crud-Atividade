package com.weg.Atividade_Crud.controller;

import com.weg.Atividade_Crud.Dto.Resposta.FuncionarioRespostaDto;
import com.weg.Atividade_Crud.service.FuncionarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    private final FuncionarioService service;


    public FuncionarioController(FuncionarioService service) {
        this.service = service;
    }


    @PostMapping
    public FuncionarioRespostaDto criar(@RequestBody FuncionarioRespostaDto funcionarioRespostaDto) {
        return service.criar(funcionarioRespostaDto);
    }


    @GetMapping
    public List<FuncionarioRespostaDto> listar() {
        return service.listar();
    }


    @GetMapping("/{id}")
    public FuncionarioRespostaDto buscar(@PathVariable Long id) {
        return service.buscar(id);
    }


    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}