package com.empleado.empleado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.empleado.empleado.entity.Empleado;
import com.empleado.empleado.service.EmpleadoService;
@RestController
public class EmpleadoController {
    @Autowired
	EmpleadoService empleadoService;

	@GetMapping("/enlistar")
	public List<Empleado> verTodo() {
		return empleadoService.listar();
	}

	@GetMapping("/enlistar/{id}")
	public Empleado verUno(@PathVariable Long id) {
		return empleadoService.verUno(id);
	}

	@PostMapping("/registrar2")
	public Empleado registar(@RequestBody Empleado empleado){
		return empleadoService.registrar(empleado);
	}

	@PutMapping("/actualizar2/{id}")
	public Empleado actualizar(@RequestBody Empleado empleado, @PathVariable Long id){
		return empleadoService.actualizar(empleado,id);
	}

	@DeleteMapping("/eliminar2/{id}")
	public void eliminar(@PathVariable Long id){
		empleadoService.eliminar(id);
	}

}
