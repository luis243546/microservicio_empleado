package com.empleado.empleado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empleado.empleado.entity.Empleado;
import com.empleado.empleado.service.EmpleadoService;
@RequestMapping("/empleado")
@RestController
public class EmpleadoController {
    @Autowired
	private EmpleadoService empleadoService;
	
	@GetMapping("/listar")
	public List<Empleado> listar(){
		return empleadoService.findAll();
	}
	
	@GetMapping("/listar/{dni}")
	public Empleado detalle(@PathVariable String dni) {
		return empleadoService.findById(dni);
	}

}
