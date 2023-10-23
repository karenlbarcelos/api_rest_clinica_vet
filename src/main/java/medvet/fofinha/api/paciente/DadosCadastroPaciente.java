package medvet.fofinha.api.paciente;

import medvet.fofinha.api.endereco.DadosEndereco;
import medvet.fofinha.api.medicoVet.Especialidade;

public record DadosCadastroPaciente(String nome, String email, String numero, DadosEndereco endereco,
                                    Especialidade especialidade) {
}
