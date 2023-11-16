package com.empleado.empleado.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.empleado.empleado.entity.Empleado;
import com.empleado.empleado.repository.EmpleadoRepository;

@Service
public class EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Transactional(readOnly = true)
    public List<Empleado> findAll() {
        return (List<Empleado>) empleadoRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Empleado findById(String dni) {
        return empleadoRepository.findById(dni).orElse(null);
    }

}
