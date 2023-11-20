package com.empleado.empleado.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empleado.empleado.entity.Empleado;
import com.empleado.empleado.repository.EmpleadoRepository;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {
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
	public Empleado actualizar(Empleado object, Long id) {
		Optional<Empleado> objectExistenteOptional = empleadoDao.findById(id);

		if (objectExistenteOptional.isPresent()) {
			Empleado empleadoExistente = objectExistenteOptional.get();

			empleadoExistente.setNombre(object.getNombre());
			empleadoExistente.setAp_pat(object.getAp_pat());
			empleadoExistente.setAp_mat(object.getAp_mat());
			empleadoExistente.setHoras_lab(object.getHoras_lab());
			empleadoExistente.setFecha_nac(object.getFecha_nac());

			return empleadoDao.save(empleadoExistente);
		} else {
			return null;
		}
	}

	@Override
	public void eliminar(Long id) {
		empleadoDao.deleteById(id);
	}
}
