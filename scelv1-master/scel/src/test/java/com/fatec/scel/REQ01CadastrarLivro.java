package com.fatec.scel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fatec.scel.model.Livro;
import com.fatec.scel.model.LivroRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class REQ01CadastrarLivro {

	@Autowired
	LivroRepository repository;

	@Test
	public void CT01CadastrarLivroComSucesso() {
		// dado que o isbn nao esta cadastrado
		// quando o usurio inclui as informacoes obrigatorias e confirma a operacao
		repository.save(new Livro("3333", "Teste de Software", "Delamaro"));
		// o sistema valida os dados e a consulta retorna a quantidade de livros cadastrados
		final List<Livro> todos = (List<Livro>) repository.findAll();
		assertEquals(1, todos.size());
		repository.deleteById(1l);
	}
	
}