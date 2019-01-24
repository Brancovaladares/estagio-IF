package br.com.iftm.entily;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity // persistencia
@Table(name = "TipoServico")
@SequenceGenerator(name = "SQ_TipoServico", sequenceName = "SQ_TipoServico", initialValue = 1, allocationSize = 1)

public class TipoServico {

	@Id

	@GeneratedValue(generator = "SQ_TipoServico", strategy = GenerationType.SEQUENCE)

	@Column(name = "CODIGO_TIPOSERVICO")

	private Integer codigo;

	@Column(name = "NOME_TIPOSERVICO", nullable = false, length = 100)

	private String nome;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}