package medvet.fofinha.api.paciente;

public record DadosListagemPaciente(

        String nomePaciente,

        String nomeTutor,

        String email,

        String cpf) {

    public DadosListagemPaciente(Paciente paciente){ this(paciente.getNome_paciente(),
            paciente.getNome_tutor(), paciente.getEmail(), paciente.getCpf());
    }
}
