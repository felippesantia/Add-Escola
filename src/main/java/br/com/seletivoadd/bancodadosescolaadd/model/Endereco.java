package br.com.seletivoadd.bancodadosescolaadd.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_endereco")

public class Endereco {

    private String logradouro;

    private String complemento;

    private String bairro;

    private String cidade;

    private String estado;

    @OneToOne
    private Escola escola;


}
