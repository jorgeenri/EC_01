package com.example.model;

import java.io.Serializable;

public class Universidad implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7524871145477531166L;

	
	public Integer idUniversidad;
	public String Universidad;
	public Integer getIdUniversidad() {
		return idUniversidad;
	}
	public void setIdUniversidad(Integer idUniversidad) {
		this.idUniversidad = idUniversidad;
	}
	public String getUniversidad() {
		return Universidad;
	}
	public void setUniversidad(String universidad) {
		Universidad = universidad;
	}
	
	
}
