package medvet.fofinha.api.medicoVet;

//DTO que representa os dados que serão devolvidos no controller
public record DadosListagemMedico(

        Long id,

        String nome,

        String email,

        String crmv,

        Especialidade especialidade) {

    public DadosListagemMedico (MedicoVet medicoVet){
        this(medicoVet.getId(), medicoVet.getNome(), medicoVet.getEmail(), medicoVet.getCrmv(), medicoVet.getEspecialidade());
    }

}
