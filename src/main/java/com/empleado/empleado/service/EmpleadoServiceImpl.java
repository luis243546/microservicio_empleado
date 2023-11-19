package com.empleado.empleado.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empleado.empleado.entity.Empleado;
import com.empleado.empleado.repository.EmpleadoRepository;
@Service
public class EmpleadoServiceImpl implements EmpleadoService{
    @Autowired
	EmpleadoRepository empleadoDao;
	
	@Override
	public List<Empleado> listar() {
		return (List<Empleado>) empleadoDao.findAll();
	}

	@Override
	public Empleado verUno(Long id) {
		return empleadoDao.findById(id).orElse(null);
	}

	@Override
	public Empleado registrar(Empleado empleado) {
		return empleadoDao.save(empleado);
	}

	@Override
	public Empleado actualizar(Empleado empleado) {
		return empleadoDao.save(empleado);
	}

	@Override
	public void eliminar(Empleado empleado) {
		empleadoDao.delete(empleado);
	}
}
