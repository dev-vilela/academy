package br.com.academy.dao;

import br.com.academy.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AlunoDao extends JpaRepository<Aluno, Integer> {

    @Query("select p from Aluno p where p.status = 'ATIVO' ")
    public List<Aluno> findByStatusAtivos();

    @Query("select a from Aluno a where a.status = 'INATIVO' ")
    public List<Aluno> findByStatusInativo();

}
