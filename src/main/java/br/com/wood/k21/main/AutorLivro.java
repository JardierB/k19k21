package br.com.wood.k21.main;

import java.util.ArrayList;
import java.util.List;

import br.com.wood.k21.persistence.dao.AutorDAO;
import br.com.wood.k21.persistence.dao.LivroDAO;
import br.com.wood.k21.persistence.dao.impl.AutorDAOImpl;
import br.com.wood.k21.persistence.dao.impl.LivroDAOImpl;
import br.com.wood.k21.persistencia.entity.Autor;
import br.com.wood.k21.persistencia.entity.Livro;

public class AutorLivro {

	public static void main(String[] args) {
		AutorDAO autorDAO = new AutorDAOImpl();
		LivroDAO livroDAO = new LivroDAOImpl();
		
		Autor a1 = new Autor();
		a1.setNome("Machado De Assis");
		
		Autor a2 = new Autor();
		a2.setNome("Kaka Mortal");
		
		a1 = autorDAO.save(a1);
		a2 = autorDAO.save(a2);
		
		List<Autor> autores = new ArrayList<Autor>();
		autores.add(a1); autores.add(a2);
		
		Livro l1 = new Livro();
		l1.setNome("O Conto do Vigário");
		l1.setAutores(autores);
		livroDAO.save(l1);

	}

}
