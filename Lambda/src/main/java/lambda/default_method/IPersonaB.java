package lambda.default_method;

public interface IPersonaB {

	default public void hablar() {
		System.out.println("implement defaul method - personaB"); 
	}
	
}
