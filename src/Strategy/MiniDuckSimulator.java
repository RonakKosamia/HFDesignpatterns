
package Strategy;

public class MiniDuckSimulator {

	public static void main(String[] args)
	{ 
	
	Duck mallard = new MallardDuck();

	mallard.performQuack();
    mallard.performfly();
    
    
    
    Duck model = new ModelDuck();
    model.performfly();
    model.setFlyBehaviour(new FlyRocketPowered());
    model.performfly();
}

}