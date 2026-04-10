package com.weg.Atividade_Crud.service;

import com.weg.Atividade_Crud.Dto.Resposta.ProjetoRespostaDto;
import com.weg.Atividade_Crud.mapper.ProjetoMapper;
import com.weg.Atividade_Crud.model.Funcionario;
import com.weg.Atividade_Crud.model.Projeto;
import com.weg.Atividade_Crud.repository.FuncionarioRepository;
import com.weg.Atividade_Crud.repository.ProjetoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetoService {

    private final ProjetoRepository repository;
    private final FuncionarioRepository funcionarioRepo;

    public ProjetoService(ProjetoRepository repository,
                          FuncionarioRepository funcionarioRepo) {
        this.repository = repository;
        this.funcionarioRepo = funcionarioRepo;
    }

    public ProjetoRespostaDto criar(ProjetoRespostaDto projetoRespostaDto) {
        Projeto projeto = new Projeto();
        projeto.setNome(projetoRespostaDto.getNome());

        if (projetoRespostaDto.getFuncionarios() != null) {
            List<Funcionario> funcionarios = funcionarioRepo.findAllById(projetoRespostaDto.getFuncionarios());
        }

        return ProjetoMapper.toDto(repository.save(projeto));
    }

    public List<ProjetoRespostaDto> listar() {
        return repository.findAll().stream().map(ProjetoMapper::toDto).toList();
    }

    public ProjetoRespostaDto buscar(Long id) {
        return ProjetoMapper.toDto(repository.findById(id).orElseThrow());
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
