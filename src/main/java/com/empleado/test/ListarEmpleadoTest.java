package com.empleado.test;

import com.empleado.dao.EmpleadoDao;
import com.empleado.dao.impl.EmpleadoDaoImpl;
import com.empleado.model.Empleado;

public class ListarEmpleadoTest {

	public static void main(String[] args) {
		
		EmpleadoDao dao = new EmpleadoDaoImpl();
		
		for(Empleado empleado :dao.litarEmpleado()) {
			System.out.println(empleado);
		}

	}

}
