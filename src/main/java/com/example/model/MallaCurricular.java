package com.example.model;

import java.io.Serializable;

public class MallaCurricular implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7937841672193640284L;
	
	public Integer idMalla;
	public String año;
	
	public Integer getIdMalla() {
		return idMalla;
	}
	public void setIdMalla(Integer idMalla) {
		this.idMalla = idMalla;
	}
	public String getAño() {
		return año;
	}
	public void setAño(String año) {
		this.año = año;
	}
	
	
	

}
