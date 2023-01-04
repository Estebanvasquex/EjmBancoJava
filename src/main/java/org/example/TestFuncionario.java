package org.example;

import org.example.model.Contador;
import org.example.model.Funcionario;

public class TestFuncionario {

	public static void main(String[] args) {
		Funcionario diego = new Contador();
		diego.setDocumento("Diego");
		diego.setDocumento("444556665");
		diego.setSalario(2000);
		diego.setTipo(0);
		
		System.out.println(diego.getSalario());
		System.out.println(diego.getBonificacion());
	}


}
