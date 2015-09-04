
package Strategy;


public abstract class Duck {
 
FlyBehaviour flyBehaviour;
QuackBehaviour quackBehviour;
 public Duck(){
                 
				}
public abstract void display();
public void performfly(){
	flyBehaviour.fly();
	}

public void performQuack(){
	
	quackBehviour.quack();
	}

public void swim(){ 
	System.out.println("all ducks float ,even decoy");}


/* we can call this seeter methods anytime when we want to change the behavior of duck on fly*/
public void setFlyBehaviour(FlyBehaviour fb){
	flyBehaviour = fb;
}

public void setQuackBehaviour(QuackBehaviour qb){
	quackBehviour = qb;
}


}