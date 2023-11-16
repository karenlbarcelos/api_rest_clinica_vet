package medvet.fofinha.api.paciente;

public record DadosListagemPaciente(

        Long id,

        String nomePaciente,

        String nomeTutor,

        String email,

        String cpf) {

    public DadosListagemPaciente(Paciente paciente){ this(paciente.getId(), paciente.getNome_paciente(),
            paciente.getNome_tutor(), paciente.getEmail(), paciente.getCpf());
    }
}
