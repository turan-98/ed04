package com.fatec.scel.model;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends CrudRepository<Aluno, String> {
		
	@Query("SELECT l FROM Aluno l WHERE l.ra = :ra")
    public Livro findByRa(@Param("ra") String ra);
		
}
