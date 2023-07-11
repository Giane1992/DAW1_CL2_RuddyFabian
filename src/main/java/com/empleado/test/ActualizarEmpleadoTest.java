package com.empleado.test;

import com.empleado.dao.EmpleadoDao;
import com.empleado.dao.impl.EmpleadoDaoImpl;
import com.empleado.model.Empleado;

public class ActualizarEmpleadoTest {

	public static void main(String[] args) {
		EmpleadoDao dao = new EmpleadoDaoImpl();
		Empleado empleado = dao.buscarEmpleado(1);
		System.out.println(empleado);
		empleado.setApellidos("Billantoy Arango");
		String mensaje = dao.actualizarEmpleado(empleado);
		System.out.println(mensaje);
		System.out.println(empleado);

	}

}
