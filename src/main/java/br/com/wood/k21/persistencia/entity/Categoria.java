package br.com.wood.k21.persistencia.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "domain", name = "categoria")
@SequenceGenerator(name = "seq_categoria", sequenceName = "domain.seq_categoria", allocationSize = 1, initialValue = 1)
public class Categoria implements Serializable {
	private static final long serialVersionUID = -2532376778750189461L;

	@Id
	@GeneratedValue(generator = "seq_categoria", strategy = GenerationType.SEQUENCE)
	@Column(name = "id_categoria")
	private Integer idCategoria;

	private String nome;
	private String descricao;
	
	@Column(name="fg_ativo")
	private Boolean ativo;
	
	@OneToMany(mappedBy="categoria")
	private List<Produto> produtos;

	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idCategoria == null) ? 0 : idCategoria.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (idCategoria == null) {
			if (other.idCategoria != null)
				return false;
		} else if (!idCategoria.equals(other.idCategoria))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Categoria [nome=" + nome + ", descricao=" + descricao
				+ ", ativo=" + ativo + "]";
	}

	
}
