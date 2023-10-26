package medvet.fofinha.api.medicoVet;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import medvet.fofinha.api.endereco.DadosEndereco;

public record DadosCadastroMedico(

        @NotBlank //apenas para Strings
        String nome,

        @NotBlank
        @Email
        String email,

        @NotBlank
        String telefone,

        @NotBlank
        @Pattern(regexp = "\\d{4,6}")
        String crmv,

        @NotNull  //para numeros
        Especialidade especialidade,

        @NotNull
        @Valid
        DadosEndereco endereco) {

}
