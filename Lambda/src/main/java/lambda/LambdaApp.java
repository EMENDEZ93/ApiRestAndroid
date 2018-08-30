package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class LambdaApp {

	public void ordenar() {
		List<String> lista = new ArrayList<>();
		lista.add("REZMOND");
		lista.add("DEZMEN");
		lista.add("EDWIN");

		System.out.println("************ Ordenado *************");
		for (String elemento : lista) {
			System.out.println(elemento);
		}

		// imperativo
		/**
		 * Collections.sort(lista, new Comparator<String>() {
		 * 
		 * @Override public int compare(String o1, String o2) { return o1.compareTo(o2);
		 *           }
		 * 
		 *           });
		 **/

		// declarativo
		Collections.sort(lista, (String p1, String p2) -> p1.compareTo(p2));

		System.out.println("************ Ordenado *************");
		for (String elemento : lista) {
			System.out.println(elemento);
		}

	}

	public void calcular() {

		// imperativo
		/**
		 * Operacion operacion = new Operacion() {
		 * 
		 * @Override public double promedio(double a, double b) { return (a+b)/2; } };
		 * 
		 *           System.out.println("************ imperativo ****************");
		 *           System.out.println(operacion.promedio(2, 5));
		 **/

		// Declarativo

		// 1 way
		Operacion operacion = (double x, double y) -> (x+y)/2;

		// 2 way
		//Operacion operacion = (double x, double y) -> {
			//return (x + y) / 2;
		//};

		// 3 way
		//Operacion operacion = (x, y) -> (x + y)/2;

		// 4 way - method without parametes
		//Operacion operacion = () -> 2;
		
		// 5 way
		/**Operacion operacion = () -> {
			double x = 2;
			double y = 2;
			return x+y; 
		};**/
		
		
		
		System.out.println("************ Declarativo ****************");
		System.out.println(operacion.promedio(6, 8));

	}

	public static void main(String[] args) {

		LambdaApp app = new LambdaApp();
		// app.ordenar();
		app.calcular();

	}

}
