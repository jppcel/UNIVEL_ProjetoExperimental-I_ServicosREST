package br.univel.model;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Version;

@Entity
public class Disciplinas implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	@Version
	@Column(name = "version")
	private int version;

	@Column(length = 11)
	private Integer Codigo_Disciplinas;

	@Column
	private String nome_disciplina;

	@Column
	private String carga_horaria;

	@Column(length = 10)
	private Integer num_max_faltas;

	@Column
	private String situacao_materia;

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
		if (!(obj instanceof Disciplinas)) {
			return false;
		}
		Disciplinas other = (Disciplinas) obj;
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

	public Integer getCodigo_Disciplinas() {
		return Codigo_Disciplinas;
	}

	public void setCodigo_Disciplinas(Integer Codigo_Disciplinas) {
		this.Codigo_Disciplinas = Codigo_Disciplinas;
	}

	public String getNome_disciplina() {
		return nome_disciplina;
	}

	public void setNome_disciplina(String nome_disciplina) {
		this.nome_disciplina = nome_disciplina;
	}

	public String getCarga_horaria() {
		return carga_horaria;
	}

	public void setCarga_horaria(String carga_horaria) {
		this.carga_horaria = carga_horaria;
	}

	public Integer getNum_max_faltas() {
		return num_max_faltas;
	}

	public void setNum_max_faltas(Integer num_max_faltas) {
		this.num_max_faltas = num_max_faltas;
	}

	public String getSituacao_materia() {
		return situacao_materia;
	}

	public void setSituacao_materia(String situacao_materia) {
		this.situacao_materia = situacao_materia;
	}

	@Override
	public String toString() {
		String result = getClass().getSimpleName() + " ";
		if (Codigo_Disciplinas != null)
			result += "Codigo_Disciplinas: " + Codigo_Disciplinas;
		if (nome_disciplina != null && !nome_disciplina.trim().isEmpty())
			result += ", nome_disciplina: " + nome_disciplina;
		if (carga_horaria != null && !carga_horaria.trim().isEmpty())
			result += ", carga_horaria: " + carga_horaria;
		if (num_max_faltas != null)
			result += ", num_max_faltas: " + num_max_faltas;
		if (situacao_materia != null && !situacao_materia.trim().isEmpty())
			result += ", situacao_materia: " + situacao_materia;
		return result;
	}
}