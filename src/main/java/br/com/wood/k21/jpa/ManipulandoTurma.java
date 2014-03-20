package br.com.wood.k21.jpa;

import br.com.wood.k21.persistencia.entity.Periodo;
import br.com.wood.k21.persistencia.entity.Turma;

public class ManipulandoTurma {
	public static void main(String[] args) {
		Turma t = new Turma();
		t.setPeriodo(Periodo.NOTURNO);
		
		ManipuladorDeDados m = new ManipuladorDeDados();
		m.persistir(t);
	}

}
