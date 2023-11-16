package medvet.fofinha.api.medicoVet;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import medvet.fofinha.api.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(

        @NotNull
        Long id,

        String nome,

        String telefone,

        DadosEndereco endereco
) {

}
