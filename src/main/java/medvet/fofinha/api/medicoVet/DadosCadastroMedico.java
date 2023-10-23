package medvet.fofinha.api.medicoVet;

import medvet.fofinha.api.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crmv, Especialidade especialidade,
                                  DadosEndereco endereco) {


}
