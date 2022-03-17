package br.com.seletivoadd.bancodadosescolaadd.service;

import br.com.seletivoadd.bancodadosescolaadd.model.Escola;
import br.com.seletivoadd.bancodadosescolaadd.model.dto.EscolaForm;
import br.com.seletivoadd.bancodadosescolaadd.model.dto.EscolaUpdateForm;
import br.com.seletivoadd.bancodadosescolaadd.model.Turma;
import br.com.seletivoadd.bancodadosescolaadd.repository.EscolaRepository;

import java.util.List;

public interface EscolaService {

    /**
     * Cria uma Escola e salva no banco de dados.
     * @param form formulário referente aos dados para criação de uma Escola no banco de dados.
     * @return Escola recém-criada.
     */
    Escola create(EscolaForm form);

    /**
     * Retorna uma Escola que está no banco de dados de acordo com seu Id.
     * @param id id da Escola que será exibido.
     * @return Escola de acordo com o Id fornecido.
     */
    Escola get(Long id);

    /**
     * Retorna as Escolas que estão no banco de dados.
     * @return Uma lista de Escolas que estão salvas no DB.
     */
    List<EscolaRepository> getAll(String nome);

    /**
     * Atualiza a Escola.
     * @param id id da Escola que será atualizado.
     * @param formUpdate formulário referente aos dados necessários para atualização da Escola
     * no banco de dados.
     * @return Escola recém-atualizada.
     */
    Escola update(Long id, EscolaUpdateForm formUpdate);

    /**
     * Deleta uma Escola específico.
     * @param id id da Escola que será removida.
     */
    void delete(Long id);

    List<Turma> getAllTurmaId(Long id);

}
