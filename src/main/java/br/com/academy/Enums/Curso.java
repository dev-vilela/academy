package br.com.academy.Enums;

public enum Curso {

    ADMNISTRACAO("Administração"),
    ENGENHARIA_DE_SOFTWARE("Engenharia de Software"),
    CONTABILIDADE("Contabilidade"),
    PROGRAMACAO("Programação"),
    ENFERMAGEM("Enfermagem");

    private String curso;

    private Curso(String curso){
        this.curso = curso;
    }


}
