package medvet.fofinha.api.controller;


import jakarta.validation.Valid;
import medvet.fofinha.api.medicoVet.DadosCadastroMedico;
import medvet.fofinha.api.medicoVet.DadosListagemMedico;
import medvet.fofinha.api.medicoVet.MedicoRepository;
import medvet.fofinha.api.medicoVet.MedicoVet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired //injecao de dependencias
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados){
        repository.save(new MedicoVet(dados));  //recebido no padrao DTO e convertido p padrao medico
    }

    @GetMapping
    public Page<DadosListagemMedico> listar(Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemMedico::new);
    }

}
