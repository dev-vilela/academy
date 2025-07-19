package br.com.academy.model;

import br.com.academy.Enums.Curso;
import br.com.academy.Enums.Status;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nomeAluno")
    @Size(min = 5, max = 35, message = "O nome deve conter no mínimo 5 caracteres")
    @NotBlank(message = "O nome não pode ser vazio.")
    private String nome;

    @Column(name = "curso")
    @Enumerated(EnumType.STRING)
    @NotNull(message = "O campo curso não pode ser nulo")
    private Curso curso;

    @Column(name = "matricula")
    @NotNull(message = "Clique no Botão Gerar!")
    @Size(min = 3, message = "Clique no Botão Gerar!")
    private String matricula;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    @NotNull(message = "O campo status não pode ser nulo.")
    private Status status;

    @NotBlank(message = "O turno não pode ser vazio.")
    @Size(min = 4, message = "No mínimo 4 caracteres.")
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
