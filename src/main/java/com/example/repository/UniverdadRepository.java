package com.example.repository;

import java.util.List;

import com.example.model.Universidad;

public interface UniverdadRepository {
	
	public void guardarUniversidad(Universidad u);
	public void eliminarUniversidad(Integer id);
	public void editarUniversidad(Universidad p);
	public List<Universidad>listarUniversidadr();
	public Universidad UniversidadById();

}