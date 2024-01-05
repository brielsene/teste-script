package br.com.gerascriptbra.controllers;

import br.com.gerascriptbra.models.Teste;
import br.com.gerascriptbra.services.TesteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TesteController {

    @Autowired
    private TesteService testeService;

//    @GetMapping
//    public List<Teste>getAllTestes(){
//        return testeService.getAllTestes();
//    }

    @GetMapping("/listar-testes")
    public String getAllTestes(Model model) {
        List<Teste> testes = testeService.getAllTestes();
        model.addAttribute("testes", testes);
        return "lista-testes";
    }
}
