package lambda.functional_interfaces;

import lambda.Operacion;

public class FunctionalInterface {

	public double operar(double x, double y) {
		Operacion op = (n1, n2) -> n1 + n2;
		return op.promedio(x,  y );
	}
	
	public static void main() {
		FunctionalInterface functionalInterface = new FunctionalInterface();
		functionalInterface.operar(2, 3);
		System.out.println();
	}
	
}
