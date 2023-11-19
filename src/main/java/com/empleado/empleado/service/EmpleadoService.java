package com.empleado.empleado.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.empleado.empleado.entity.Empleado;

@Service
public interface EmpleadoService {

    public List<Empleado> listar();
	
	public Empleado verUno(Long id);

    public Empleado registrar(Empleado empleado);

    public Empleado actualizar(Empleado empleado);

    public void eliminar(Empleado empleado);
}
