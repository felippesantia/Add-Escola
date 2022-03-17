package br.com.seletivoadd.bancodadosescolaadd.repository;

import br.com.seletivoadd.bancodadosescolaadd.model.Escola;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EscolaRepository extends JpaRepository<EscolaRepository, Long> {

    List<EscolaRepository> findByNome(String nome);

    List<EscolaRepository> findEscolaEndereco(String endereco);
}
