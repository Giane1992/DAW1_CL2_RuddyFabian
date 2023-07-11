package com.empleado.dao;

import java.util.List;

import com.empleado.model.Empleado;

public interface EmpleadoDao {
	
	public String registrarEmpleado(Empleado empleado);
	
	public Empleado buscarEmpleado(int id);
	
	public List<Empleado> litarEmpleado();
	
	public String actualizarEmpleado(Empleado empleado);
	
	public String eliminarEmpleado(int id);

}
