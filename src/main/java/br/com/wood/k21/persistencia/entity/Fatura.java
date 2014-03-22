package br.com.wood.k21.persistencia.entity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(schema = "domain")
public class Fatura {

	@Id
	@GeneratedValue
	private Integer id;
	private String numero;

	@Temporal(TemporalType.DATE)
	private Calendar data;

	@OneToMany(mappedBy = "fatura")
	private Collection<Ligacao> ligacoes = new ArrayList<Ligacao>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public Collection<Ligacao> getLigacoes() {
		return ligacoes;
	}

	public void setLigacaos(Collection<Ligacao> ligacoes) {
		this.ligacoes = ligacoes;
	}

}
