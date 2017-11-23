package iterator;


public class MyCollection implements Collection {

	public String string[] = { "A", "B", "C", "D", "E" };

	

	@Override
	public Object get(int i) {

		return string[i];
	}

	@Override
	public int size() {

		return string.length;
	}

	@Override
	public MyIterator iterator() {

		return new MyIterator(this);
	}
}