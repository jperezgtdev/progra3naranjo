package com.umg.baseprojectumg.service.impl;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.springframework.stereotype.Service;

import com.umg.baseprojectumg.entity.Nodos;
import com.umg.baseprojectumg.service.IColas;

@Service
public class ColasImpl implements IColas {

	@Override
	public String llenarColas(List<Nodos> elementos) {
		Queue<Integer> cola = new ConcurrentLinkedQueue<>();
		for (Nodos elemento: elementos) {
			cola.add(elemento.getNodo());
		}
		return String.valueOf(cola.size());
	}
	
}
