package medvet.fofinha.api.paciente;

import medvet.fofinha.api.endereco.DadosEndereco;
import medvet.fofinha.api.medicoVet.Especialidade;

public record DadosCadastroPaciente(

        String nome_paciente,

        String nome_tutor,

        String email,

        String telefone,

        DadosEndereco endereco,

        Especialidade especialidade) {
}
