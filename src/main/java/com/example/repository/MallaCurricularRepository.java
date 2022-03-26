package com.example.repository;

import java.util.List;

import com.example.model.MallaCurricular;

public interface MallaCurricularRepository {
	
	public void guardarMallaCurricular(MallaCurricular m);
	public void eliminarMallaCurricular(Integer id);
	public void editarMallaCurricular(MallaCurricular p);
	public List<MallaCurricular>listarMallaCurricular();
	public MallaCurricular MallaCurricularById();
	

}
