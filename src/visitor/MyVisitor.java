package visitor;


public class MyVisitor implements Visitor{

	@Override
	public void visit(Subject sbj) {

		System.out.println("Visit the subject : "+sbj.getSubject());
	}
	
}
