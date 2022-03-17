package br.com.seletivoadd.bancodadosescolaadd.service;

import br.com.seletivoadd.bancodadosescolaadd.model.Aluno;
import br.com.seletivoadd.bancodadosescolaadd.model.Turma;
import br.com.seletivoadd.bancodadosescolaadd.model.dto.TurmaForm;
import br.com.seletivoadd.bancodadosescolaadd.model.dto.TurmaUpdateForm;

import java.util.List;

public interface TurmaService {

    /**
     * Cria uma Turma e salva no banco de dados.
     * @param form formulário referente aos dados para criação de uma Turma no banco de dados.
     * @return Turma recém-criada.
     */
    Turma create(TurmaForm form);

    /**
     * Retorna uma Turma que está no banco de dados de acordo com seu Id.
     * @param id id da Turma que será exibido.
     * @return Turma de acordo com o Id fornecido.
     */
    Turma get(int id);

    Turma get(Long id);

    /**
     * Retorna as Turmas que estão no banco de dados.
     * @return Uma lista com as Turmas que estão salvas no DB.
     */
    List<Turma> getAll(String nome);

    /**
     * Atualiza o Turma.
     * @param id id da Turma que será atualizada.
     * @param formUpdate formulário referente aos dados necessários para atualização da Turma
     * no banco de dados.
     * @return Turma recém-atualizado.
     */
    Turma update(Long id, TurmaUpdateForm formUpdate);

    /**
     * Deleta uma Turma específica.
     * @param id id da Turma que será removido.
     */
    void delete(Long id);

    List<Aluno> getAllAlunoId(Long id);

}
