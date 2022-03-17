package br.com.seletivoadd.bancodadosescolaadd.service.impl;


import br.com.seletivoadd.bancodadosescolaadd.model.dto.EscolaForm;
import br.com.seletivoadd.bancodadosescolaadd.model.dto.EscolaUpdateForm;
import br.com.seletivoadd.bancodadosescolaadd.model.Escola;
import br.com.seletivoadd.bancodadosescolaadd.model.Turma;
import br.com.seletivoadd.bancodadosescolaadd.repository.EscolaRepository;
import br.com.seletivoadd.bancodadosescolaadd.repository.TurmaRepository;
import br.com.seletivoadd.bancodadosescolaadd.service.EscolaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class EscolaServiceImpl implements EscolaService {

    @Autowired
    private EscolaRepository escolaRepository;

    @Autowired
    private TurmaRepository turmaRepository;

    @Override
    public Escola create(EscolaForm form) {
        Escola escola = new Escola();
        escola.setNome(form.getNome());
        escola.setEndereco(form.getEndereco());

        return null;

    }

    @Override
    public Escola get(Long id) {
        return null;
    }

    @Override
    public List<EscolaRepository> getAll(String nome) {
        if(nome == null) {
            return escolaRepository.findAll();
        } else {
            return escolaRepository.findEscolaEndereco(nome);
        }
    }

    @Override
    public Escola update(Long id, EscolaUpdateForm formUpdate) {

        return null;
    }

    @Override
    public void delete(Long id) {
    }


}
