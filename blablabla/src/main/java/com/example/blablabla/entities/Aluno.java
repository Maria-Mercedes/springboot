package com.example.blablabla.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity (name = "Alunos")
public class Aluno implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "RA")
    int ra;

    @Column (name = "Nome")
    String nome;

    LocalDate dataCadastro;

    public Aluno() {}

    public Aluno(String nome, LocalDate dataCadastro) {
        this.nome = nome;
        this.dataCadastro = dataCadastro;
    }

    public int getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
