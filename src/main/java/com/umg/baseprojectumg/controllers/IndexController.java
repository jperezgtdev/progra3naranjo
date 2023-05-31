package com.umg.baseprojectumg.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.umg.baseprojectumg.entity.Nodos;
import com.umg.baseprojectumg.service.IArboles;
import com.umg.baseprojectumg.service.IColas;

@RestController
public class IndexController {
	//add->ok
	//size -> ok
	//peek -> ok
	//remove -> ok
	//poll -> 
	
	@Autowired
	private IArboles arbolesService;
	@Autowired
	private IColas colasService;
	
	@GetMapping(value = "/testclass", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Nodos> testClass() {
		List<Nodos> listNodos = new ArrayList<>();
		
		listNodos.add(new Nodos(10));
		listNodos.add(new Nodos(20));
		listNodos.add(new Nodos(30));
		
		return listNodos;
	}
	
	@PostMapping(value = "/arboles", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String recorrerArboles(@RequestBody List<Nodos> nodos) {
		return arbolesService.recorrerArboles(nodos);
	}
	
	@PostMapping(value = "/llenarcola", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String llenarCola(@RequestBody List<Nodos> nodos) {
		return colasService.llenarColas(nodos);
	}
	
	@GetMapping(value = "/obtenercabecera")
	public Integer obtenerCabecera() {
		Integer result = colasService.obtenerCabecera();
		return result;
	}
	
	@GetMapping(value = "/obtenertamano")
	public Integer obtenerTamano() {
		Integer result = colasService.obtenerTamano();
		return result;
	}
	
	@RequestMapping(value = "/eliminarelemento/{elemento}" , method = RequestMethod.DELETE)
	public String eliminarElemento(@PathVariable("elemento") Integer elemento) {
		return colasService.eliminarElemento(elemento);
	}
	
	@RequestMapping(value = "/eliminarcabecera", method = RequestMethod.DELETE)
	public String eliminarCabecera() {
		return colasService.eliminarCabecera();
	}
	
}
