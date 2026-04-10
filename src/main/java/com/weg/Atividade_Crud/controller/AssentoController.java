package com.weg.Atividade_Crud.controller;

import com.weg.Atividade_Crud.Dto.Resposta.AssentoRespostaDto;
import com.weg.Atividade_Crud.service.AssentoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assentos")
public class AssentoController {

    private final AssentoService service;


    public AssentoController(AssentoService service) {
        this.service = service;
    }


    @PostMapping
    public AssentoRespostaDto criar(@RequestBody AssentoRespostaDto assentoRespostaDto) {
        return service.criar(assentoRespostaDto);
    }


    @GetMapping
    public List<AssentoRespostaDto> listar() {
        return service.listar();
    }


    @GetMapping("/{id}")
    public AssentoRespostaDto buscar(@PathVariable Long id) {
        return service.buscar(id);
    }


    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}