package com.empleado.test;

import com.empleado.dao.EmpleadoDao;
import com.empleado.dao.impl.EmpleadoDaoImpl;
import com.empleado.model.Empleado;

public class RegistroEmpleadoTest {

	public static void main(String[] args) {
		
		EmpleadoDao dao = new EmpleadoDaoImpl();
		Empleado empleado = new Empleado(0,"Richard","Garay Mercado","42191121");
		String mensaje = dao.registrarEmpleado(empleado);
		System.out.println(mensaje);

	}

}
