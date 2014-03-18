package br.com.wood.k21.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/*
 * Criando a tablela manualmente no PostgreSQL
 * 
 * create table domain.carros(
 *  id bigint not null,
 *	modelo varchar(20),
 *	marca varchar(20)
 *)
 *  create sequence seq_carro
 *  alter table domain.carros alter column id set default nextval('domain.seq_carro');
 * 
 * 
 * 
 */

@Entity
@Table(schema = "domain", name = "carros")
@SequenceGenerator(name = "carro", sequenceName = "domain.seq_carro", allocationSize = 1, initialValue = 1)
public class Carro {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carro")
	private Long id;

	@Column(length = 20)
	private String modelo;
	@Column(length = 20)
	private String marca;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
