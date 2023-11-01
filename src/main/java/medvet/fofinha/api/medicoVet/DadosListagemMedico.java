package medvet.fofinha.api.medicoVet;

//DTO que representa os dados que serão devolvidos no controller
public record DadosListagemMedico(

        String nome,

        String email,

        String crmv,

        Especialidade especialidade) {

    public DadosListagemMedico (MedicoVet medicoVet){
        this(medicoVet.getNome(), medicoVet.getEmail(), medicoVet.getCrmv(), medicoVet.getEspecialidade());
    }

}
