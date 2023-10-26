package medvet.fofinha.api.medicoVet;

import jakarta.persistence.*;
import lombok.*;
import medvet.fofinha.api.endereco.Endereco;

@Table(name = "medicos")
@Entity(name = "Medico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")  //para gerar os hash codes somente no id
public class MedicoVet {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String crmv;

    @Enumerated(EnumType.STRING)  //Enumerated pois trata-se de um enum
    private Especialidade especialidade;

    @Embedded
    private Endereco endereco;

    public MedicoVet(DadosCadastroMedico dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.crmv = dados.email();
        this.especialidade = dados.especialidade();
        this.endereco = new Endereco(dados.endereco());
    }
}
