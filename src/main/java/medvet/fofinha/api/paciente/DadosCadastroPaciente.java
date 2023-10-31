package medvet.fofinha.api.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import medvet.fofinha.api.endereco.DadosEndereco;
import medvet.fofinha.api.medicoVet.Especialidade;

public record DadosCadastroPaciente(

        @NotBlank
        String nome_paciente,

        @NotBlank
        String nome_tutor,

        @NotBlank
        @Email
        String email,

        @NotBlank @Pattern(regexp = "\\d{11}")
        String telefone,

        @NotNull @Valid
        DadosEndereco endereco,

        @NotNull
        Especialidade especialidade) {
}
