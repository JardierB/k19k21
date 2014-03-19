package br.com.wood.k21.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(schema = "domain", name = "pessoas")
@SequenceGenerator(name = "pessoa", sequenceName = "domain.pessoas_id_seq", allocationSize = 1, initialValue = 1)
public class Pessoa {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,  generator = "pessoa")
	private Long id;
	private String nome;
	private BigDecimal altura;
	
	@Transient
	private int idade;

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

	public BigDecimal getAltura() {
		return altura;
	}

	public void setAltura(BigDecimal altura) {
		this.altura = altura;
	}

}
