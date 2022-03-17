package br.com.seletivoadd.bancodadosescolaadd.service.impl;


import br.com.seletivoadd.bancodadosescolaadd.model.dto.TurmaForm;
import br.com.seletivoadd.bancodadosescolaadd.model.Turma;
import br.com.seletivoadd.bancodadosescolaadd.repository.EscolaRepository;
import br.com.seletivoadd.bancodadosescolaadd.repository.TurmaRepository;
import br.com.seletivoadd.bancodadosescolaadd.service.TurmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class TurmaServiceImpl implements TurmaService {

    @Autowired
    private TurmaRepository turmaRepository;

    @Autowired
    private EscolaRepository escolaRepository;

    @Override
    public Turma create(TurmaForm form) {
        Turma turma = new Turma();
        Turma novaTurma = this.turmaRepository.save(turma);
        turma.setNome(form.getNome());
        turma.setCapacidade(form.getCapacidade());

        return null;
    }

    @Override
    public Turma get(Long id) {
        return turmaRepository.findById(id).get();
    }

    @Override
    public List<Turma> getAll(String nome) {

        if(nome == null){
            return turmaRepository.findAll();
        }else{
            return turmaRepository.findTurmasNaEscola(nome);
        }

    }

    @Override
    public void delete(Long id) {}




}
