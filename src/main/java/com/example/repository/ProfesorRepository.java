package com.example.repository;

import java.util.List;


import com.example.model.Profesor;

public interface ProfesorRepository {
	
	public void guardarProfesor(Profesor p);
	public void eliminarProfesor(Integer id);
	public void editarProfesor(Profesor p);
	public List<Profesor>listarProfesor();
	public Profesor ProfesorById();

}
