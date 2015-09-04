package Observer;

public class WeatherStation {

	
	public static void main(String[] args){
		
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentdisplay = new CurrentConditionsDisplay(weatherData);
		//StatisticsDisplay Stats = new  StatisticsDisplay();
		
		weatherData.setMeasurements(20, 80, 70);
		weatherData.setMeasurements(80, 90, 60);
		weatherData.setMeasurements(40, 85, 50);
	}
	
}
