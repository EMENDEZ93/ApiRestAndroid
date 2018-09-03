package lambda.default_method;

public class DefaultMethod implements IPersonaA, IPersonaB {

	
	@Override
	public void caminar() {
		System.out.println("running.......");
	}
	
	@Override
	public void hablar() {
		IPersonaB.super.hablar();
	}

	public static void main(String[] args) {
		DefaultMethod defaultMethod = new DefaultMethod();
		defaultMethod.hablar();
	}
	
}
