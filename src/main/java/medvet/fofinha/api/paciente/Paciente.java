package medvet.fofinha.api.paciente;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import medvet.fofinha.api.endereco.Endereco;
import medvet.fofinha.api.medicoVet.Especialidade;

@Table(name = "pacientes")
@Entity(name = "Paciente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
//entidade JPA
public class Paciente {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome_paciente;
    private String nome_tutor;
    private String cpf;
    private String email;
    private String telefone;

    @Embedded //os atributos da tabela Endereco serao mapeados como parte da tabela paciente
    private Endereco endereco;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    private Boolean ativo;

    public Paciente(DadosCadastroPaciente dados) {
        this.ativo = true;
        this.nome_paciente = dados.nome_paciente();
        this.nome_tutor = dados.nome_tutor();
        this.cpf = dados.cpf();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.especialidade = dados.especialidade();
        this.endereco = new Endereco(dados.endereco());
    }

    public void atualizarInfos(DadosAtualizacaoPaciente dados) {

        if(dados.nomeTutor() != null){
            this.nome_tutor = dados.nomeTutor();
        }

        if(dados.telefone() != null){
            this.telefone = dados.telefone();
        }

        if(dados.endereco() != null){
            this.endereco.atualizarInfos(dados.endereco());
        }
    }

    public void inativar() {
        this.ativo = false;
    }
}
