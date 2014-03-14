package br.com.wood.k21.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.wood.k21.domain.Editora;

public class GerandoTabelas {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dbk21");
		Editora e = new Editora();
		e.setNome("FTD");
		
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();;
		em.persist(e);
		
		em.getTransaction().commit();
		em.close();
		factory.close();
		
		
	}

}
