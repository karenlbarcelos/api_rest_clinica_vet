package medvet.fofinha.api.controller;


import medvet.fofinha.api.medicoVet.DadosCadastroMedico;
import medvet.fofinha.api.medicoVet.MedicoRepository;
import medvet.fofinha.api.medicoVet.MedicoVet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired //injecao de dependencias
    private MedicoRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedico dados){
        repository.save(new MedicoVet(dados));  //recebido no padrao DTO e convertido p padrao medico
    }
}
