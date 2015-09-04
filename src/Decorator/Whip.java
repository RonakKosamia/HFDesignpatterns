package Decorator;

public class Whip extends CondimentsDecoraters {
	Beverage beverage;
	
	public Whip(Beverage beverage){
		
		this.beverage = beverage;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public Double cost() {
		// TODO Auto-generated method stub
		return .30 + beverage.cost();
	}

}
