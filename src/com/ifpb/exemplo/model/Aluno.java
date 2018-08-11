package com.ifpb.exemplo.model;

import java.util.Objects;

/**
 * A classe Aluno modela a entidade aluno do domínio da aplicação.
 * Essa classe foi simplificada para <b>facilitar o desenvolvimento</b>
 * @author Paulo Freitas
 * @since 1.0
 * @version 1.0
 */

public class Aluno {

    private int matricula;
    private String nome;
    private String curso;

    /**
     * Instancia um objeto aluno com matrícula igual a 0, e nome e curso
     * iguais a nulo.
     * @deprecated
     * @throws NullPointerException
     */
    public Aluno() {
    }

    /**
     * Cria um objeto aluno com atributos passados por referência.
     * @param matricula a matrícula do aluno
     * @param nome o nome do aluno
     * @param curso o curso que o aluno está matriculado
     */
    public Aluno(int matricula, String nome, String curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
    }

    /**
     * Retorna a matrícula do aluno como objeto inteiro
     * @return a matrícula do aluno
     */
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", curso='" + curso + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno)) return false;
        Aluno aluno = (Aluno) o;
        return getMatricula() == aluno.getMatricula();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMatricula());
    }
}
