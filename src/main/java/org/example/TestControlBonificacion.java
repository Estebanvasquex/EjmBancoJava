package org.example;

import org.example.model.Contador;
import org.example.model.ControlBonificacion;
import org.example.model.Funcionario;
import org.example.model.Gerente;

public class TestControlBonificacion {

	public static void main(String[] args) {
		Funcionario diego = new Contador();
		diego.setSalario(2000);
		
		Gerente jimena = new Gerente();
		jimena.setSalario(10000);

		Contador alexiz = new Contador();
		alexiz.setSalario(5000);
		
		ControlBonificacion controlBonificacion =
				new ControlBonificacion();
		
		controlBonificacion.registrarSalario(diego);
		controlBonificacion.registrarSalario(jimena);
		controlBonificacion.registrarSalario(alexiz);
	}


}
