package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Curso;

public interface CursoRepository  extends JpaRepository<Curso, Integer>{
	
	public void guardarCurso(Curso c);
	public void eliminarCurso(Integer id);
	public void editarCurso(Curso p);
	public List<Curso>listarCurso();
	public Curso cursoById();
	
}
