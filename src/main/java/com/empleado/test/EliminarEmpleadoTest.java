package com.empleado.test;

import com.empleado.dao.EmpleadoDao;
import com.empleado.dao.impl.EmpleadoDaoImpl;

public class EliminarEmpleadoTest {

	public static void main(String[] args) {
		
		EmpleadoDao dao = new EmpleadoDaoImpl();
		
		String mensaje = dao.eliminarEmpleado(1);
		System.out.println(mensaje);

	}

}
