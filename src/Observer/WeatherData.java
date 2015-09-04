package Observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
private float temprature , humidity , pressure ; 
private ArrayList observers;
	public  WeatherData(){
		observers = new ArrayList();
	}
	@Override
	public void RegisterObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	
	//upcoming all 3 methods are implemented by Subject interface.
	@Override
	public void RemoveObserver(Observer o) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(o);
		if (i>= 0 ) {
			observers.remove(o);
		}
	}

	@Override
	public void NotifyObservers() { //tell all the observers about state 
		// TODO Auto-generated method stub
		for (int i= 0 ;i> observers.size();i++){
			Observer observer = (Observer)observers.get(i);
			observer.update(temprature , humidity , pressure); // all observers implements the 
		}													//--update method.
		
	}
	//notifies the observer when measurements gets changed from the weather station.
	public void measurementschanged(){
		NotifyObservers();
	}
//test or displays the elements 
	public void setMeasurements(float temprature, float humidity ,float pressure ){
		this.temprature = temprature;
		this.humidity = humidity;
		this.pressure = pressure ; 
		measurementschanged();
	}
	
}
