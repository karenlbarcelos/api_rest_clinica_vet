package medvet.fofinha.api.controller;

import jakarta.validation.Valid;
import medvet.fofinha.api.paciente.DadosCadastroPaciente;
import medvet.fofinha.api.paciente.DadosListagemPaciente;
import medvet.fofinha.api.paciente.Paciente;
import medvet.fofinha.api.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroPaciente dados){
        repository.save(new Paciente(dados));
    }

    @GetMapping
    public Page<DadosListagemPaciente> listar(@PageableDefault(size = 10) Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemPaciente::new);
    }


}
