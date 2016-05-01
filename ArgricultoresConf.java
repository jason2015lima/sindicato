package com.sind.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.sind.modelo.Agricultores;

public class ArgricultoresConf implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	//Busca todos do Banco de Dados
	public List<Agricultores> todas() {
		return manager.createQuery("from Agricultores", Agricultores.class).getResultList();
	}
}
