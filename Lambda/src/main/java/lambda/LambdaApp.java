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
		for(String elemento : lista) {
			System.out.println(elemento);
		}
		
		/** Collections.sort(lista, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
			
		}); **/
	
		
		Collections.sort(lista, (String p1, String p2) -> p1.compareTo(p2));
		
		System.out.println("************ Ordenado *************");
		for(String elemento : lista) {
			System.out.println(elemento);
		}
		
	}
	
	public static void main(String[] args) {
		
		LambdaApp app = new LambdaApp();
		app.ordenar();
	}
	
	
}
