/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weather.o.rama;

/**
 *
 * @author Khoirul Umam
 */
public class StatisticsDisplay implements Observer, DisplayElement{
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings;
    private WeatherData weatherData;
    
    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    
    public void update(float temp, float humidity, float pressure) {
        tempSum += temp;
        numReadings++;
        
        if (temp > maxTemp) {
            maxTemp = temp;
        }
        else if (temp < minTemp) {
            minTemp = temp;
        }
        
        display();
    }
    
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) 
                + "/" + maxTemp + "/" + minTemp);
    }
}
