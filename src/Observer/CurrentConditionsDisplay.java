package Observer;


//as asked we have to built 3 display classes ; 1 current condition , statistics ,& forecast

//here this is the display class which shows current condtions of wheather . 
public class CurrentConditionsDisplay implements Observer , DisplayElement {
//it implements Observer so we can get changes from weather data objects and also implements 
	//Displayelements because API requires all  dispaly elements 
	
	private float humidity , temprature;
	private Subject weatherdata;

	public CurrentConditionsDisplay(Subject weatherdata){
		//parameter weatherdata used to register display as an observer
		this.weatherdata = weatherdata;
		weatherdata.RegisterObserver(this);
	}
	@Override
	public void update(float temprature, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temprature = temprature;
		this.humidity = humidity;
		display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("CurrentCondtions : " +temprature+ "F degrees and" +humidity+ "% humidity");
	}

	
}
