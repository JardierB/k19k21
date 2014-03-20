package br.com.wood.k21.persistence.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {
	private static final String UNIT_NAME = "dbk21";

	private EntityManagerFactory emf = null;
	private EntityManager em = null;

	public Conexao() {

	}

	public EntityManager getEntityManager() {
		if (emf == null) {
			emf = Persistence.createEntityManagerFactory(UNIT_NAME);
		}

		if (em == null) {
			em = emf.createEntityManager();
		}

		return em;
	}

}
