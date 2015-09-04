package Decorator;

public abstract class Beverage {

	String Description = "unknown beverages";
	
	String tall;
    String grande;
    String venti;
	
	public String getDescription() {
		return Description;
		
	}

	public void setSize(){
	 

	}
	public String getSize(){
		return getSize();
		
	}
	public abstract Double cost();
		

}
