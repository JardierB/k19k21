package br.com.wood.k21.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.wood.k21.domain.Carro;

public class ManipulandoCarro {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("dbk21");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();

		Carro c = new Carro();
		c.setMarca("Volks");
		c.setModelo("Fusca");

		manager.persist(c);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}
}
