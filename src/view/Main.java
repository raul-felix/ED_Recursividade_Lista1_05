package view;

import controller.SomatoriaController;

public class Main {
	
	public static void main(String[] args) {
		
		SomatoriaController somatoriaController = new SomatoriaController();
		double resultado = somatoriaController.somatoriaFracao(5);
		System.out.println(resultado);
	}

}
