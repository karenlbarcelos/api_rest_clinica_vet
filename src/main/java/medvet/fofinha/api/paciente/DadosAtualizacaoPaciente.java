package medvet.fofinha.api.paciente;

import jakarta.validation.constraints.NotNull;
import medvet.fofinha.api.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(

        @NotNull
        Long id,

        String nomeTutor,

        String telefone,

        DadosEndereco endereco) {
}
