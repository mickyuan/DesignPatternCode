package flyweight;

public class ConcreteFlyWeight implements FlyWeight {

	private Character intrinsicState = null;

	/*
	 * 内部元素
	 */
	public ConcreteFlyWeight(Character state) {

		this.intrinsicState = state;
	}

	/*
	 * 外部元素
	 */
	@Override
	public void operation(String state) {

		System.out.println("Intrinsic State = " + this.intrinsicState);
		System.out.println("Extrinsic State = " + state);
	}

}
