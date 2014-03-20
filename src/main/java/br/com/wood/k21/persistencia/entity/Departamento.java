package br.com.wood.k21.persistencia.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(schema = "domain")
public class Departamento {
	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	
	/*@OneToMany
	@JoinTable(name="domain.dep_func",
			joinColumns=@JoinColumn(name="dep_id"),
			inverseJoinColumns=@JoinColumn(name="func_id"))
	private Collection<Funcionario> funcionarios;*/
	@OneToMany
	private List<Funcionario> funcionarios;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	
	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	

}
