package observer.weather;

import javafx.beans.Observable;

public class CurrentConditionsDisplay implements Observer {

  private Subject weatherData;

  private float temperature;
  private float humidity;


  public CurrentConditionsDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    this.weatherData.registerObserver(this);
  }

  @Override
  public void update(float temp, float humidity, float pressure) {
    this.temperature = temp;
    this.humidity = humidity;
    display();
  }

  private void display() {
    System.out.println("Current conditions: " + temperature
        + "F degrees and " + humidity + "% humidity");
  }
}
