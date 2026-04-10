package com.weg.Atividade_Crud.service;

import com.weg.Atividade_Crud.Dto.Resposta.FuncionarioRespostaDto;
import com.weg.Atividade_Crud.mapper.FuncionarioMapper;
import com.weg.Atividade_Crud.model.Assento;
import com.weg.Atividade_Crud.model.Funcionario;
import com.weg.Atividade_Crud.repository.AssentoRepository;
import com.weg.Atividade_Crud.repository.FuncionarioRepository;
import com.weg.Atividade_Crud.repository.ProjetoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    private final FuncionarioRepository repository;
    private final AssentoRepository assentoRepo;
    private final ProjetoRepository projetoRepo;

    public FuncionarioService(FuncionarioRepository repository,
                              AssentoRepository assentoRepo,
                              ProjetoRepository projetoRepo) {
        this.repository = repository;
        this.assentoRepo = assentoRepo;
        this.projetoRepo = projetoRepo;
    }

    public FuncionarioRespostaDto criar(FuncionarioRespostaDto funcionarioRespostaDto) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(funcionarioRespostaDto.getNome());

        if (funcionarioRespostaDto.getCodigoAssento() != null) {
            Assento a = assentoRepo.findById(Long.valueOf(funcionarioRespostaDto.getCodigoAssento())).orElseThrow();
            funcionario.setAssento(a);
        }

        if (funcionarioRespostaDto.getCodigoAssento() != null) {
            funcionario.setProjetos(projetoRepo.findAllById(funcionarioRespostaDto.getCodigoAssento()));
        }

        return FuncionarioMapper.toDto(repository.save(funcionario));
    }

    public List<FuncionarioRespostaDto> listar() {
        return repository.findAll().stream().map(FuncionarioMapper::toDto).toList();
    }

    public FuncionarioRespostaDto buscar(Long id) {
        return FuncionarioMapper.toDto(repository.findById(id).orElseThrow());
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}