package com.psy.model;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RegistrosPenDisfuncionais implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String situacao;	
	private String pa;
	private String comportamento;
	private String emocao;	
	private Date data;
	
}
