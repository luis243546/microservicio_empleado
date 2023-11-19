package com.empleado.empleado.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import java.time.LocalDate;
@Entity
@Table(name = "empleado")
@Data
public class Empleado {
    @Id
	private Long dni;
	private String nombre;
	private String ap_pat;
	private String ap_mat;
	private Double horas_lab;
	@Temporal(TemporalType.DATE)
	private LocalDate fecha_nac;
}
