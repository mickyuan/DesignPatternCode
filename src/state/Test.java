package state;

public class Test {

	public static void main(String[] args) {

		/**
		 * context的变化是随着state的状态变化而变化的（context持有state对象）
		 */
		State state = new State();
		Context context = new Context(state);
		state.setValue("state1");
		context.method();
		state.setValue("state2");
		context.method();
	}
}
