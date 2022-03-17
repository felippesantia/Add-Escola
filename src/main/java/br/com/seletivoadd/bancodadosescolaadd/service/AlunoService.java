package br.com.seletivoadd.bancodadosescolaadd.service;

import br.com.seletivoadd.bancodadosescolaadd.model.Aluno;
import br.com.seletivoadd.bancodadosescolaadd.model.dto.AlunoForm;
import br.com.seletivoadd.bancodadosescolaadd.model.dto.AlunoUpdateForm;
import br.com.seletivoadd.bancodadosescolaadd.model.Turma;

import java.util.List;

public interface AlunoService {

    /**
     * Cria um Aluno e salva no banco de dados.
     * @param form formulário referente aos dados para criação de um Aluno no banco de dados.
     * @return Aluno recém-criado.
     */
    Aluno create(AlunoForm form);

    /**
     * Retorna um Aluno que está no banco de dados de acordo com seu Id.
     * @param id id do Aluno que será exibido.
     * @return Aluno de acordo com o Id fornecido.
     */
    Aluno get(Long id);

    /**
     * Retorna os Alunos que estão no banco de dados.
     * @return Uma lista os Alunos que estão salvas no DB.
     */

    List<Aluno> getAll(String nome);

    /**
     * Atualiza o Aluno.
     * @param id id do Aluno que será atualizado.
     * @param formUpdate formulário referente aos dados necessários para atualização do Aluno
     * no banco de dados.
     * @return Aluno recém-atualizado.
     */
    Aluno update(Long id, AlunoUpdateForm formUpdate);

    /**
     * Deleta um Aluno específico.
     * @param id id do Aluno que será removido.
     */
    void delete(Long id);

    List<Turma> getAllTurmaId(Long id);

}
