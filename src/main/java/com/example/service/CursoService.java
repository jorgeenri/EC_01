package com.example.service;

import java.util.List;

import com.example.model.Curso;

public interface CursoService {
	
	public void guardarCurso(Curso c);
	public void eliminarCurso(Integer id);
	public void editarCurso(Curso p);
	public List<Curso>listarCurso();
	public Curso cursoById();

}
