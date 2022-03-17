package br.com.seletivoadd.bancodadosescolaadd.controller;


import br.com.seletivoadd.bancodadosescolaadd.model.Escola;
import br.com.seletivoadd.bancodadosescolaadd.model.Turma;
import br.com.seletivoadd.bancodadosescolaadd.model.dto.EscolaForm;
import br.com.seletivoadd.bancodadosescolaadd.repository.EscolaRepository;
import br.com.seletivoadd.bancodadosescolaadd.service.impl.EscolaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/escolas")
public class EscolaController {

    @Autowired
    private EscolaServiceImpl service;

    public Escola create(@RequestBody EscolaForm form){
        return service.create(form);
    }

    @GetMapping("/turmas/{id}")
    public List<Turma> getTurmaId(@PathVariable Long id) {
        return service.getAllTurmaId(id);
    }

    @GetMapping
    public List<EscolaRepository> getAll(@RequestParam(value = "nome", required = false)
                                      String nome){
        return service.getAll(nome);
    }



}
