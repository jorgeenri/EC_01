package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Curso;
import com.example.repository.CursoRepository;

@Service
public class CursoServiceImpl implements CursoService {

	
	@Autowired
	public CursoRepository repository;
	
	@Override
	public void guardarCurso(Curso c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarCurso(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void editarCurso(Curso p) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Curso> listarCurso() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Curso cursoById() {
		// TODO Auto-generated method stub
		return null;
	}

}
