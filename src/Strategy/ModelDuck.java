package Strategy;

public class ModelDuck extends Duck {
	
	public ModelDuck(){
	flyBehaviour = new FlyNoWay();
	quackBehviour = new Quack();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("i am a model duck !");
	}

}
