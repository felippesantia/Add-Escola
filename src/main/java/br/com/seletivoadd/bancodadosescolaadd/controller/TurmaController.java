package br.com.seletivoadd.bancodadosescolaadd.controller;

import br.com.seletivoadd.bancodadosescolaadd.model.Aluno;
import br.com.seletivoadd.bancodadosescolaadd.model.Turma;
import br.com.seletivoadd.bancodadosescolaadd.model.dto.AlunoForm;
import br.com.seletivoadd.bancodadosescolaadd.model.dto.TurmaForm;
import br.com.seletivoadd.bancodadosescolaadd.service.impl.TurmaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/turmas")
public class TurmaController {

    @Autowired
    private TurmaServiceImpl service;

    @PostMapping
    public Turma create(@Valid @RequestBody TurmaForm form) {
        return service.create(form);
    }

    @GetMapping("/alunos/{id}")
    public List<Aluno> getAllAlunoId(@PathVariable Long id) {
        return service.getAllAlunoId(id);
    }

    @GetMapping
    public List<Turma> getAll(@RequestParam(value = "nome", required = false)
                                      String nome){
        return service.getAll(nome);
    }
}
