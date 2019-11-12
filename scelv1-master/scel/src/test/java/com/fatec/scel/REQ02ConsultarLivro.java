package com.fatec.scel;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fatec.scel.model.Livro;
import com.fatec.scel.model.LivroRepository;
@RunWith(SpringRunner.class)
@SpringBootTest
public class REQ02ConsultarLivro {
	@Autowired
	LivroRepository repository;
	@Test
	public void CT02ConsultarLivroPorISBNComSucesso() {
		//dado que o isbn 3333 esta cadastrado
		repository.save(new Livro("3333", "Teste de Software", "Delamaro"));
		//quando o usurio consulta pelo isbn 
		Livro livro = repository.findByIsbn("3333");
		//o sistema retonra not null
		assertNotNull(livro);

		repository.deleteById(1l);
	}

}
