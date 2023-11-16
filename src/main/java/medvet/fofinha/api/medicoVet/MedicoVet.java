package medvet.fofinha.api.medicoVet;

import jakarta.persistence.*;
import lombok.*;
import medvet.fofinha.api.endereco.Endereco;

@Table(name = "medicos")
@Entity(name = "Medico")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")  //para gerar os hashcodes somente no id
public class MedicoVet {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String crmv;

    @Enumerated(EnumType.STRING)  //Enumerated pois trata-se de um enum
    private Especialidade especialidade;

    @Embedded
    private Endereco endereco;

    public MedicoVet(DadosCadastroMedico dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.crmv = dados.crmv();
        this.especialidade = dados.especialidade();
        this.endereco = new Endereco(dados.endereco());
    }

    public void atualizarInfos(DadosAtualizacaoMedico dados) {

        if(dados.nome() != null){
            this.nome = dados.nome();
        }

        if(dados.telefone() != null){
            this.telefone = dados.telefone();
        }

        if(dados.endereco() != null){
            this.endereco.atualizarInfos(dados.endereco());
        }
    }
}
