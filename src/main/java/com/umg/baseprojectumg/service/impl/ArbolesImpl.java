package com.umg.baseprojectumg.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.umg.baseprojectumg.entity.Nodos;
import com.umg.baseprojectumg.service.IArboles;

@Service
public class ArbolesImpl implements IArboles {

	@Override
	public String recorrerArboles(List<Nodos> nodos) {
		Integer[] arrayList = (Integer[]) nodos.toArray();
		//TODO Agregar logica para recorrer arboles
		return null;
	}

}
