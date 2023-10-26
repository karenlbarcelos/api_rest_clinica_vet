package medvet.fofinha.api.paciente;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import medvet.fofinha.api.endereco.DadosEndereco;
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
    private String nome;
    private String email;
    private String numero;

    @Embedded //os atributos da tabela Endereco serao mapeados como parte da tabela paciente
    private DadosEndereco endereco;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

}
