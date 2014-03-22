package br.com.wood.k21.main;

import java.util.ArrayList;
import java.util.List;

import br.com.wood.k21.persistence.dao.DepartamentoDAO;
import br.com.wood.k21.persistence.dao.FuncionarioDAO;
import br.com.wood.k21.persistence.dao.impl.DepartamentoDAOImpl;
import br.com.wood.k21.persistence.dao.impl.FuncionarioDAOImpl;
import br.com.wood.k21.persistencia.entity.Departamento;
import br.com.wood.k21.persistencia.entity.Funcionario;

public class DepartamentoFuncionario {
	public static void main(String[] args) {
		FuncionarioDAO funcionarioDAO = new FuncionarioDAOImpl();
		DepartamentoDAO departamentoDAO = new DepartamentoDAOImpl();
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Carolina Dick");
		
		Funcionario f2 = new Funcionario();
		f2.setNome("Jair Rodrigues");
		
		f1 = funcionarioDAO.save(f1);
		f2 = funcionarioDAO.save(f2);
		
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		funcionarios.add(f1); funcionarios.add(f2);
		
		Departamento d = new Departamento();
		d.setNome("Consórcio");
		d.setFuncionarios(funcionarios);
		
		departamentoDAO.save(d);
		
		
	}
}
