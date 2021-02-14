package com.psy.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RPD implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String situacao;
	private String pa;
	private String comportamento;
	private String emocao;
	private String dateAndHorus;

	// Tue Feb 02 00:34:00 BRST 2021 (Modelo)

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comportamento == null) ? 0 : comportamento.hashCode());
		result = prime * result + ((dateAndHorus == null) ? 0 : dateAndHorus.hashCode());
		result = prime * result + ((emocao == null) ? 0 : emocao.hashCode());
		result = prime * result + ((pa == null) ? 0 : pa.hashCode());
		result = prime * result + ((situacao == null) ? 0 : situacao.hashCode());
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
		RPD other = (RPD) obj;
		if (comportamento == null) {
			if (other.comportamento != null)
				return false;
		} else if (!comportamento.equals(other.comportamento))
			return false;
		if (dateAndHorus == null) {
			if (other.dateAndHorus != null)
				return false;
		} else if (!dateAndHorus.equals(other.dateAndHorus))
			return false;
		if (emocao == null) {
			if (other.emocao != null)
				return false;
		} else if (!emocao.equals(other.emocao))
			return false;
		if (pa == null) {
			if (other.pa != null)
				return false;
		} else if (!pa.equals(other.pa))
			return false;
		if (situacao == null) {
			if (other.situacao != null)
				return false;
		} else if (!situacao.equals(other.situacao))
			return false;
		return true;
	}

	

	
}
