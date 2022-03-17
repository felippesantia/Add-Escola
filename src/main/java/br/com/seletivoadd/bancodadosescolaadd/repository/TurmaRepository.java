package br.com.seletivoadd.bancodadosescolaadd.repository;

import br.com.seletivoadd.bancodadosescolaadd.model.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long> {

    List<Turma> findByNome(LocalDate dataDeNascimento);

    List<Turma> findTurmasNaEscola(String nome);
}
