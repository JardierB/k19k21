package br.com.wood.k21.jpa;

import java.util.ArrayList;

import br.com.wood.k21.domain.Funcionario;

public class ManipulandoFuncionario {
	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		f.setNome("Jardier");
		java.util.List<String> telefones = new ArrayList<String>();
		telefones.add("085-9621-8413");
		telefones.add("085-8561-0290");
		f.setTelefones(telefones);
		
		ManipuladorDeDados m = new ManipuladorDeDados();
		m.persistir(f);
	}

}
