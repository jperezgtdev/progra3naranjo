package com.umg.baseprojectumg.entity;

import lombok.Data;

@Data
public class Nodos {
	private Integer nodo;

	public Nodos() {
		
	}
	
	public Nodos(Integer nodo) {
		super();
		this.nodo = nodo;
	}

}
