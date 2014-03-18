package br.com.wood.k21.jpa;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.wood.k21.domain.Pessoa;

public class ManipulandoPessoas {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dbk21");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Jardier Bezerra Aires");
		p1.setAltura(new BigDecimal(1.70));
		
		manager.persist(p1);
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}
}
