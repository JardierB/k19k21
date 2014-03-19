package br.com.wood.k21.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManipuladorDeDados {
	private EntityManagerFactory factory;
	private EntityManager manager;

	public ManipuladorDeDados() {
		carregarFabrica();

	}

	private void carregarFabrica() {
		factory = Persistence.createEntityManagerFactory("dbk21");
		manager = factory.createEntityManager();
		manager.getTransaction().begin();
	}

	public void persistir(Object clazz) {
		manager.persist(clazz);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}

}
