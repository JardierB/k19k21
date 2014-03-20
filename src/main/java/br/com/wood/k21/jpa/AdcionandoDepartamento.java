package br.com.wood.k21.jpa;

import java.util.ArrayList;
import java.util.List;

import br.com.wood.k21.persistencia.entity.Departamento;
import br.com.wood.k21.persistencia.entity.Funcionario;

public class AdcionandoDepartamento {
	public static void main(String[] args) {
		ManipuladorDeDados m = new ManipuladorDeDados();
		Departamento d = new Departamento();
		d.setNome("Informática");
		
		Funcionario f = new Funcionario();
		f.setNome("Lunga");
		
		Funcionario f1 = new Funcionario();
		f.setNome("Luana do Crato");
		
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		funcionarios.add(f);
		funcionarios.add(f1);
		d.setFuncionarios(funcionarios);
		
		m.persistir(f);
		m.persistir(f1);
		m.persistir(d);
		m.close();
		
	}
}
