package br.com.wood.k21.jpa;

import br.com.wood.k21.persistencia.entity.Estado;
import br.com.wood.k21.persistencia.entity.Governador;

public class ManipulandoEstadoGovernador {
	public static void main(String[] args) {
		Governador g = new Governador();
		g.setNome("Tasso Gereissatti");
		
		Estado e = new Estado();
		e.setNome("Ceará");
		e.setGovernador(g);
		
		ManipuladorDeDados m = new ManipuladorDeDados();
		m.persistir(g);
		m.persistir(e);
		
		m.close();
	}

}
