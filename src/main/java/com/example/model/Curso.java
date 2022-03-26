package com.example.model;

import java.io.Serializable;

public class Curso implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3981857139825013515L;
	
	
	private Integer idCurso;
	private String curso;
	private String descripcion;
	public Integer getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	

}
