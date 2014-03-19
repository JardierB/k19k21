package br.com.wood.k21.jpa;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.wood.k21.domain.Usuario;

public class AdcionandoUsuario {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dbk21");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		Usuario u = new Usuario();
		u.setEmail("jardier@hotmail.com");
		u.setDataCadastro(Calendar.getInstance());
		
		manager.persist(u);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}

}
