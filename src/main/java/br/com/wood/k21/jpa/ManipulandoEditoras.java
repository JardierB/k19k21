package br.com.wood.k21.jpa;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.wood.k21.domain.Editora;

public class ManipulandoEditoras {
	static EntityManagerFactory factory = Persistence
			.createEntityManagerFactory("dbk21");
	static EntityManager manager = factory.createEntityManager();

	public static void main(String[] args) {
		manager.getTransaction().begin();

		// buscar();
		// atualizar();
		listandoComJPQL();

		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}

	static void buscar() {
		Editora e1 = manager.find(Editora.class, 5L);
		Editora e2 = manager.getReference(Editora.class, 6L);

		System.out.println(e1.toString());
		System.out.println(e2.toString());
	}

	static void atualizar() {
		Editora e = manager.find(Editora.class, 5L);
		e.setNome("Editora Abril Altearda");
		System.out.println(e.toString());

		Editora alterada = manager.find(Editora.class, 5L);
		System.out.println(alterada.toString());
	}
	
	@SuppressWarnings("unchecked")
	static void listandoComJPQL() {
		Query query = manager.createQuery("SELECT e FROM Editora e");
		List<Editora> editoras = query.getResultList();
		for(Editora e: editoras) {
			System.out.println(e.toString());
		}
		
	}
}
