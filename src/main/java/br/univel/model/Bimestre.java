package br.univel.model;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Version;

@Entity
public class Bimestre implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	@Version
	@Column(name = "version")
	private int version;

	@Column(length = 11)
	private Integer codigo_bimestre;

	@Column
	private String nome_bimestre;

	public Long getId() {
		return this.id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(final int version) {
		this.version = version;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Bimestre)) {
			return false;
		}
		Bimestre other = (Bimestre) obj;
		if (id != null) {
			if (!id.equals(other.id)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	public Integer getCodigo_bimestre() {
		return codigo_bimestre;
	}

	public void setCodigo_bimestre(Integer codigo_bimestre) {
		this.codigo_bimestre = codigo_bimestre;
	}

	public String getNome_bimestre() {
		return nome_bimestre;
	}

	public void setNome_bimestre(String nome_bimestre) {
		this.nome_bimestre = nome_bimestre;
	}

	@Override
	public String toString() {
		String result = getClass().getSimpleName() + " ";
		if (codigo_bimestre != null)
			result += "codigo_bimestre: " + codigo_bimestre;
		if (nome_bimestre != null && !nome_bimestre.trim().isEmpty())
			result += ", nome_bimestre: " + nome_bimestre;
		return result;
	}
}