package controller;

public class SomatoriaController {
	
	public SomatoriaController() {
		super();
	}
	
	public double somatoriaFracao(int n) {
		
		if (n == 1) {
			// se n == 1, retornamos 1, pois 1/1 = 1 
			return 1;
		} else {
			// se não, calculamos a fração 1 / n
			// então retornamos a soma dessa fração com a função recursiva, passando como parâmetro (n - 1)
			double fracao = 1 / (double) n;
			return fracao + somatoriaFracao(n - 1);
		}
	}

}
