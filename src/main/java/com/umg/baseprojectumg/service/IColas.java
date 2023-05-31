package com.umg.baseprojectumg.service;

import java.util.List;

import com.umg.baseprojectumg.entity.Nodos;

public interface IColas {
	public String llenarColas(List<Nodos> elementos);
	public Integer obtenerCabecera();
	public Integer obtenerTamano();
	public String eliminarElemento(Integer elemento);
	public String eliminarCabecera();
}
