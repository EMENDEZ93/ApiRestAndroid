package lambda.default_method;

public interface IPersonaA {
	public void caminar();

	default public void hablar() {
		System.out.println("implement defaul method - PersonaA");
	}

}
