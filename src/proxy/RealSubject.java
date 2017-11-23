package proxy;


public class RealSubject implements Subject{

	@Override
	public void method() {
		System.out.println("Doing something!");
	}

}
