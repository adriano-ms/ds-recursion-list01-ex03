package controller;

public class FactorialController {
	
	public FactorialController() {
		super();
	}
	
	public int factorial(int n) {
//		Caso 'n' > 12, o metodo imediatamente retornara 0
		if(n > 12) {
			return 0;
//		Caso 'n' == 0, significa que chegou ao ultimo numero a ser multiplicado 			
		} else if(n == 0) {
			return 1;
		} else {
//		O valor 'n' atual sera multiplicado ao resultado do metodo que tem como parametro o numero anterior a 'n'
			return n * factorial(n-1);
		}
	}

}
