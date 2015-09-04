package Strategy;

public class MallardDuck extends Duck {

	public MallardDuck(){
		quackBehviour = new Quack();
		flyBehaviour = new FlyWithWings();	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("i am a real mallard duck ");
	}

}
