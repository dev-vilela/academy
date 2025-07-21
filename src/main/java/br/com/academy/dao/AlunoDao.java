package br.com.academy.dao;

import br.com.academy.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AlunoDao extends JpaRepository<Aluno, Integer> {

    @Query("select p from Aluno p where p.status = 'ATIVO' ")
    public List<Aluno> findByStatusAtivos();

    @Query("select i from Aluno i where i.status = 'INATIVO' ")
    public List<Aluno> findByStatusInativos();

    @Query("select c from Aluno c where c.status = 'CANCELADO' ")
    public List<Aluno> findByStatusCancelados();

    @Query("select t from Aluno t where t.status = 'TRANCADO' ")
    public List<Aluno> findByStatusTrancados();


}
