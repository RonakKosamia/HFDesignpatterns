package Decorator;

public class Mocha extends CondimentsDecoraters {
	Beverage beverage;
	
	public Mocha(Beverage beverage){
		
		this.beverage = beverage;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public Double cost() {
		// TODO Auto-generated method stub
		return .20 + beverage.cost();
	}

}