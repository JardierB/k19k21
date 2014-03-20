package br.com.wood.k21.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.wood.k21.persistencia.entity.Editora;

public class GerandoTabelas {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dbk21");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		Editora e1 = new Editora();
		e1.setNome("Editora FTD");
		e1.setEmail("ftd@ftd.com.br");
		
		Editora e2 = new Editora();
		e2.setNome("Editora Abril");
		e2.setEmail("abril@abril.com.br");
		
		manager.persist(e1);
		manager.persist(e2);
		
		manager.getTransaction().commit();
		manager.close();
		factory.close();
		
		
		
		
	}

}
