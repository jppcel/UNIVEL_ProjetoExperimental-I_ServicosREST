package br.univel.model;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Version;

@Entity
public class Faltas implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	@Version
	@Column(name = "version")
	private int version;

	@Column(length = 11)
	private Integer codigo_disciplina;

	@Column(length = 11)
	private Integer codigo_bimestre;

	@Column(length = 11)
	private Integer faltas_disciplina;

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
		if (!(obj instanceof Faltas)) {
			return false;
		}
		Faltas other = (Faltas) obj;
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

	public Integer getCodigo_disciplina() {
		return codigo_disciplina;
	}

	public void setCodigo_disciplina(Integer codigo_disciplina) {
		this.codigo_disciplina = codigo_disciplina;
	}

	public Integer getCodigo_bimestre() {
		return codigo_bimestre;
	}

	public void setCodigo_bimestre(Integer codigo_bimestre) {
		this.codigo_bimestre = codigo_bimestre;
	}

	public Integer getFaltas_disciplina() {
		return faltas_disciplina;
	}

	public void setFaltas_disciplina(Integer faltas_disciplina) {
		this.faltas_disciplina = faltas_disciplina;
	}

	@Override
	public String toString() {
		String result = getClass().getSimpleName() + " ";
		if (codigo_disciplina != null)
			result += "codigo_disciplina: " + codigo_disciplina;
		if (codigo_bimestre != null)
			result += ", codigo_bimestre: " + codigo_bimestre;
		if (faltas_disciplina != null)
			result += ", faltas_disciplina: " + faltas_disciplina;
		return result;
	}
}