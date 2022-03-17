package br.com.seletivoadd.bancodadosescolaadd.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TurmaForm {

    @NotEmpty(message = "Preencha o campo corretamente.")
    @Size(min = 3, max =10, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
    private String nome;

    @NotEmpty(message = "Preencha o campo corretamente.")
    @Size(min = 1, max =3, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
    private int capacidade;


}
