package br.com.seletivoadd.bancodadosescolaadd.model.dto;

import br.com.seletivoadd.bancodadosescolaadd.model.Endereco;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class EscolaForm {

    @NotEmpty(message = "Preencha o campo corretamente.")
    @Size(min = 10, max =70, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
    private String nome;

    @NotEmpty(message = "Preencha o campo corretamente.")
    @Size(min = 5, max =50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
    private Endereco endereco;

}
