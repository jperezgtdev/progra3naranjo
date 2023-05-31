package com.umg.baseprojectumg.service.impl;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.springframework.stereotype.Service;

import com.umg.baseprojectumg.entity.Nodos;
import com.umg.baseprojectumg.service.IColas;

@Service
public class ColasImpl implements IColas {
	
	Queue<Integer> cola = new ConcurrentLinkedQueue<>();

	@Override
	public String llenarColas(List<Nodos> elementos) {
		
		for (Nodos elemento: elementos) {
			cola.add(elemento.getNodo());
		}
		return String.valueOf(cola.size());
	}

	@Override
	public Integer obtenerCabecera() {
		Integer result = cola.peek();
		return result;
	}

	@Override
	public Integer obtenerTamano() {
		Integer result = cola.size();
		return result;
	}

	@Override
	public String eliminarElemento(Integer elemento) {
		boolean eliminado = cola.remove(elemento);
		if(eliminado)
			return "Elemento: " + elemento + " fue eliminado";
		else
			return "No se pudo eliminar al elemento: " + elemento;
	}

	@Override
	public String eliminarCabecera() {
		Integer eliminado = cola.poll();
		if(eliminado != null)
			return "Elemento: " + eliminado + " fue eliminado";
		else
			return "No se pudo eliminar al elemento: " + eliminado; 
	}
	
}
