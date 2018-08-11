package com.ifpb.exemplo.view;

import com.ifpb.exemplo.model.Aluno;
import com.ifpb.exemplo.model.Turma;

public class App {

    public static void main(String[] args) {

        Turma turma = new Turma("POO");

        System.out.println(turma.addAluno(new Aluno(1,
                "João", "ADS")));
        System.out.println(turma.addAluno(new Aluno(1,
                "João", "ADS")));

        System.out.println(turma.addAluno(new Aluno(2,
                "Maria", "ADS")));
        System.out.println(turma.addAluno(new Aluno(3,
                "Pedro", "ADS")));

        System.out.println(turma.getAlunos());

        Aluno a = new Aluno();

    }

}
