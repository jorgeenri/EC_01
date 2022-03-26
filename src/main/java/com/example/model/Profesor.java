package com.example.model;

import java.io.Serializable;

public class Profesor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4157911609392055117L;
	
	public Integer idProfesor;
	public String profesor;
	public Integer getIdProfesor() {
		return idProfesor;
	}
	public void setIdProfesor(Integer idProfesor) {
		this.idProfesor = idProfesor;
	}
	public String getProfesor() {
		return profesor;
	}
	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
	
	

}
