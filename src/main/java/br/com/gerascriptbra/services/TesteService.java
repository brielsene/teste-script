package br.com.gerascriptbra.services;

import br.com.gerascriptbra.models.Teste;
import br.com.gerascriptbra.repositorys.TesteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TesteService {
    @Autowired
    private TesteRepository testeRepository;

    public List<Teste>getAllTestes(){
        return testeRepository.findAll();
    }
}
