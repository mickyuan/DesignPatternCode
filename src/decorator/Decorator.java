package decorator;

public class Decorator implements Sourceable {

	private Sourceable source;

	public Decorator(Sourceable source) {

		super();
		this.source = source;
	}

	@Override
	public void method() {

		System.out.println("Before decorator!");
		source.method();
		System.out.println("After decorator!");
	}

}
