package br.com.wood.k21.persistencia.entity;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(schema = "domain")
public class Departamento {
	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	
	@OneToMany
	@JoinTable(name="domain.departamento_funcionario",
			joinColumns=@JoinColumn(name="dep_id"),
			inverseJoinColumns=@JoinColumn(name="func_id"))
	private Collection<Funcionario> funcionarios;
	
	/**
	 * Usando uma lista conforme abaixo, o JPA ira criar:
	 * Uma tabela com o nome da entidade_associaação(departamento_funcionario,
	 * e os ids: departamento_id e funcionario_id
	 * @return
	 */
//	@OneToMany
//	private List<Funcionario> funcionarios;

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

	public Collection<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	
	public void setFuncionarios(Collection<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	

}
