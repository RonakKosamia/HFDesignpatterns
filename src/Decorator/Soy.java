package Decorator;

public class Soy extends Beverage {

	private Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public Double cost() {
		// TODO Auto-generated method stub
		return .90;
	}

}
