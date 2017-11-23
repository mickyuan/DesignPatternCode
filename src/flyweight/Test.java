package flyweight;

public class Test {

	public static void main(String[] args) {

		FlyWeightFactory fwf = new FlyWeightFactory();
		FlyWeight fwa = fwf.factory(new Character('a'));
		fwa.operation("First Call");

		fwa = fwf.factory(new Character('b'));
		fwa.operation("Second Call");

		fwa = fwf.factory(new Character('a'));
		fwa.operation("Third Call");

		//		System.out.println(fwa == fwb);
		//		System.out.println(fwa == fwc);

	}
}
