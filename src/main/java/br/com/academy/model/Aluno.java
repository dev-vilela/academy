package br.com.academy.model;

import br.com.academy.Enums.Curso;
import br.com.academy.Enums.Status;
import jakarta.persistence.*;

@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nomeAluno")
    private String nome;

    @Column(name = "curso")
    @Enumerated(EnumType.STRING)
    private Curso curso;

    @Column(name = "matricula")
    private String matricula;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private Status status;

    private String turno;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
