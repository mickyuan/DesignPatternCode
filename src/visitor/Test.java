package visitor;

public class Test {

	public static void main(String[] args) {

		Visitor visitor = new MyVisitor();
		Subject sbj = new MySubject();
		sbj.accept(visitor);

	}
}
