package com.empleado.empleado.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Table(name = "empleado")
@Data
public class Empleado {
    @Id
	private String dni;
	private String nombre;
	private String ap_pat;
	private String ap_mat;
	private Integer horas_lab;
	
	@Temporal(TemporalType.DATE)
	private Date fecha_nac;
}
