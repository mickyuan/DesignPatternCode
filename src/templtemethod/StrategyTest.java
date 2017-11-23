package templtemethod;

public class StrategyTest {

	public static void main(String[] args) {

		AbstractCalculator cal = new Plus();
		int result = cal.calculate("8+8","\\+");
		System.out.println(result);
	}
}