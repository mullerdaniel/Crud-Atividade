package com.weg.Atividade_Crud.controller;

import com.weg.Atividade_Crud.Dto.Resposta.ProjetoRespostaDto;
import com.weg.Atividade_Crud.service.ProjetoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {

    private final ProjetoService service;


    public ProjetoController(ProjetoService service) {
        this.service = service;
    }


    @PostMapping
    public ProjetoRespostaDto criar(@RequestBody ProjetoRespostaDto projetoRespostaDto) {
        return service.criar(projetoRespostaDto);
    }


    @GetMapping
    public List<ProjetoRespostaDto> listar() {
        return service.listar();
    }


    @GetMapping("/{id}")
    public ProjetoRespostaDto buscar(@PathVariable Long id) {
        return service.buscar(id);
    }


    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
