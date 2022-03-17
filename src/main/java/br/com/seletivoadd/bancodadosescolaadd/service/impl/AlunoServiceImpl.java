package br.com.seletivoadd.bancodadosescolaadd.service.impl;

import br.com.seletivoadd.bancodadosescolaadd.model.dto.AlunoForm;
import br.com.seletivoadd.bancodadosescolaadd.model.dto.AlunoUpdateForm;
import br.com.seletivoadd.bancodadosescolaadd.infra.utils.JavaTimeUtils;
import br.com.seletivoadd.bancodadosescolaadd.model.Aluno;
import br.com.seletivoadd.bancodadosescolaadd.model.Turma;
import br.com.seletivoadd.bancodadosescolaadd.repository.AlunoRepository;
import br.com.seletivoadd.bancodadosescolaadd.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AlunoServiceImpl implements AlunoService {

    @Autowired
    private AlunoRepository repository;

    @Override
    public Aluno create(AlunoForm form) {
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setDataDeNascimento(form.getDataDeNascimento());

        return repository.save(aluno);

    }

    @Override
    public Aluno get(Long id) {

        return null;
    }

    @Override
    public List<Aluno> getAll(String dataDeNascimento) {
        if(dataDeNascimento == null) {
            return repository.findAll();
        } else {
            LocalDate localDate = LocalDate.parse(dataDeNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
            return repository.findByDataDeNascimento(localDate);
        }
    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {
    }

    @Override
    public List<Turma> getAllTurmaId(Long id) {
        Aluno aluno = repository.findById(id).get();

        return (List<Turma>) aluno.getTurma();
    }

}
