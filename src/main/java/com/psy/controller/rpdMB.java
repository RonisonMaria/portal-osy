package com.psy.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.psy.model.RPD;

import lombok.Getter;
import lombok.Setter;

@Named("beanRPD")
@SessionScoped
public class rpdMB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Getter
	@Setter
	@Inject
	private RPD rpd;

	@Getter
	@Setter
	private List<RPD> rpds = new ArrayList<>();

	public String adicionar() {
		rpds.add(rpd);
		clean();
		return null;

	}

	private void clean() {
		rpd = new RPD();
	}

}
