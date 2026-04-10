package com.weg.Atividade_Crud.service;

import com.weg.Atividade_Crud.Dto.Resposta.AssentoRespostaDto;
import com.weg.Atividade_Crud.mapper.AssentoMapper;
import com.weg.Atividade_Crud.model.Assento;
import com.weg.Atividade_Crud.model.Funcionario;
import com.weg.Atividade_Crud.repository.AssentoRepository;
import com.weg.Atividade_Crud.repository.FuncionarioRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class AssentoService {

    private final FuncionarioRepository funcionarioRepository;
    private final AssentoRepository assentoRepository;

    public AssentoService(AssentoRepository assentoRepository, FuncionarioRepository funcionarioRepository) {
        this.assentoRepository = assentoRepository;
        this.funcionarioRepository = funcionarioRepository;
    }


    public AssentoRespostaDto criar(AssentoRespostaDto dto) {
        Assento assento = new Assento();
        assento.setCodigo(assento.getCodigo());

        if(dto.getCodigoAssento() != null) {
            Funcionario funcionario = funcionarioRepository.findById(Long.valueOf(dto.getCodigoAssento())).orElseThrow();
            assento.setFuncionario(funcionario);
        }

        return AssentoMapper.toDto(assentoRepository.save(assento));
    }

    public List<AssentoRespostaDto> listar() {
        return assentoRepository.findAll().stream().map(AssentoMapper::toDto).toList();
    }


    public AssentoRespostaDto buscar(Long id) {
        return AssentoMapper.toDto(assentoRepository.findById(id).orElseThrow());
    }


    public void deletar(Long id) {
        assentoRepository.deleteAllById(Collections.singleton(id));
    }
}
