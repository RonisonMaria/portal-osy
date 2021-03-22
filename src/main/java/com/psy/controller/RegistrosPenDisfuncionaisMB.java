package com.psy.controller;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.annotation.PostConstruct;
//import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.constraints.Future;

import org.primefaces.PrimeFaces;
import org.primefaces.event.SelectEvent;

import com.psy.model.RegistrosPenDisfuncionais;

import lombok.Getter;
import lombok.Setter;

@Named("RegistrosPenDisfuncionaisMB")
@SessionScoped
public class RegistrosPenDisfuncionaisMB implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Future
	@Getter
	private Date data;
	private List<Date> invalidDates;
	private List<Integer> invalidDays;


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

	public void setData(Date data) {
		rpd.setData(data);
		this.data = data;
	}



	@PostConstruct
	public void init() {
		invalidDates = new ArrayList<>();
		Date today = new Date();
		invalidDates.add(today);
		long oneDay = 24 * 60 * 60 * 1000;
		for (int i = 0; i < 5; i++) {
			invalidDates.add(new Date(invalidDates.get(i).getTime() + oneDay));
		}

		invalidDays = new ArrayList<>();
		invalidDays.add(0); /* the first day of week is disabled */
		invalidDays.add(3);
		data = GregorianCalendar.getInstance().getTime();
	}

	public void onDateSelect(SelectEvent<Date> event) {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		facesContext.addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected", format.format(event.getObject())));
	}


}
