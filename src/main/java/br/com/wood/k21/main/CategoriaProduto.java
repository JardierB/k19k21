package br.com.wood.k21.main;

import java.math.BigDecimal;

import br.com.wood.k21.persistence.dao.CategoriaDAO;
import br.com.wood.k21.persistence.dao.ProdutoDAO;
import br.com.wood.k21.persistence.dao.impl.CategoriaDAOImpl;
import br.com.wood.k21.persistence.dao.impl.ProdutoDAOImpl;
import br.com.wood.k21.persistencia.entity.Categoria;
import br.com.wood.k21.persistencia.entity.Produto;

public class CategoriaProduto {
	public static void main(String[] args) {
		ProdutoDAO produtoDAO = new ProdutoDAOImpl();
		CategoriaDAO categoriaDAO = new CategoriaDAOImpl();
		
		Categoria categoria = new Categoria();
		categoria.setNome("Livros de Informática");
		categoria.setDescricao("Livros de desenvolvimento, bando de dados...");
		categoria.setAtivo(Boolean.TRUE);
		
		categoria = categoriaDAO.save(categoria);
		
		Produto p1 = new Produto();
		p1.setNome("Java SErver Faces");
		p1.setQuantidade(10);
		p1.setValor(new BigDecimal(100.25));
		p1.setCategoria(categoria);
		
		Produto p2 =  new Produto();
		p2.setNome("Persistência com JPA e Hibernate");
		p2.setQuantidade(30);
		p2.setValor(new BigDecimal(150.50));
		p2.setCategoria(categoria);
		
		produtoDAO.save(p1);
		produtoDAO.save(p2);
	}

}
