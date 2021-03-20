package com.psy.controller;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.psy.model.RegistrosPenDisfuncionais;

import lombok.Getter;
import lombok.Setter;

@Named("RegistrosPenDisfuncionaisMB")
@SessionScoped
public class RegistrosPenDisfuncionaisMB implements Serializable {

	private static final long serialVersionUID = 1L;

	@Getter
	@Setter	
	private RegistrosPenDisfuncionais rpd = new RegistrosPenDisfuncionais();

	@Getter
	@Setter
	private List<RegistrosPenDisfuncionais> rpds = new ArrayList<>();

	public void adicionar() {
		rpds.add(rpd);
		cleanRpd();	
	}

	private void cleanRpd() {
		rpd = new RegistrosPenDisfuncionais();
	}

}
