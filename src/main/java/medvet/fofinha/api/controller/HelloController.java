package medvet.fofinha.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //anotacao utilizada para reconhecer uma classe como controller
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String olaMundo(){
        return "Hello world! Teste again";
    }
}
