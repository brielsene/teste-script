package br.com.gerascriptbra.models;

import jakarta.persistence.*;

@Entity
@Table(name = "teste")
public class Teste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
}
