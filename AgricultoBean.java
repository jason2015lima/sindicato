package com.sind.controle;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.sind.modelo.Agricultores;
import com.sind.repository.ArgricultoresConf;

@Named
@ViewScoped
public class AgricultoBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private ArgricultoresConf agri;
	
	private List<Agricultores> todosAgricultores;
	
	public void consultar(){
		todosAgricultores = agri.todas();
	}

	//Get e Set
		
	public List<Agricultores> getTodosAgricultores() {
		return todosAgricultores;
	}

	public ArgricultoresConf getAgri() {
		return agri;
	}

	public void setAgri(ArgricultoresConf agri) {
		this.agri = agri;
	}

}
