package lambda;

public class ScopesLambda {

	final double n3 = 3;
	
	public double probarLocalVariable() {
	
		Operacion op = new Operacion() {

		@Override
		public double promedio(double a, double b) {
				return a + b + n3;
			}
		};
		
		Operacion operacion = (x, y) -> {
			return x + y; 
		};
		
		return op.promedio(3, 5);
	}	
	
	public double probarAtributosStaticVariable() {
		Operacion operacion = (x, y) -> {
			return (x + y);
		};
		return operacion.promedio(3, 3);
	}
	
	
	public static void main(String[] args) {
		
		ScopesLambda scope = new ScopesLambda();
		
		System.out.println("**************************");
		System.out.println(scope.probarLocalVariable());
	
	}
	
}
