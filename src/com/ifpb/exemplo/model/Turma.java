package com.ifpb.exemplo.model;

import java.util.HashSet;
import java.util.Set;

/**
 * @see com.ifpb.exemplo.model.Aluno
 */

public class Turma {

    private String disciplina;
    private Set<Aluno> alunos;

    public Turma(String disciplina) {
        this.disciplina = disciplina;
        alunos = new HashSet<>();
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public boolean addAluno(Aluno aluno){
        return alunos.add(aluno);
    }

    public Set<Aluno> getAlunos(){
        return alunos;
    }

}
