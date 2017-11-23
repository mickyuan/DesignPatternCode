package decorator.starbuzz;

public class Mocha2 extends CondimentDecorator {

	Beverage beverage;

	public Mocha2(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {

		return beverage.getDescription() + ",Mocha";
	}

	@Override
	public double cost() {

		return 0.40 + beverage.cost();
	}

}
