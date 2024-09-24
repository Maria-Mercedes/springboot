package com.example.blablabla;

import com.example.blablabla.entities.Aluno;
import com.example.blablabla.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

@SpringBootApplication
public class BlablablaApplication implements CommandLineRunner {
    @Autowired
    private AlunoRepository alunoRepository;
    public static void main(String[] args) {
        SpringApplication.run(BlablablaApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Aluno aluno1 = new Aluno("Maria Mercedes", LocalDate.parse("01/08/2022", formato));
        alunoRepository.saveAll(Arrays.asList(aluno1));
    }
}
