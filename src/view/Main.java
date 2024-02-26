package view;

import controller.FactorialController;

public class Main {

	public static void main(String[] args) {
		
		FactorialController fc = new FactorialController();
		
		System.out.println(fc.factorial(9));

	}

}
