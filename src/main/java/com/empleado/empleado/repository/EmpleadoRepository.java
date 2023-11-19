package com.empleado.empleado.repository;

import org.springframework.data.repository.CrudRepository;

import com.empleado.empleado.entity.Empleado;

public interface EmpleadoRepository extends CrudRepository<Empleado, Long>{
    
}
