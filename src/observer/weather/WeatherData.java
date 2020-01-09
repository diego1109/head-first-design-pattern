package observer.weather;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WeatherData implements Subject {

  //  老生常谈：主题中要维护一个观察者列表
  private List<Observer> observers;

  private float temperature;
  private float humidity;
  private float pressure;

  public WeatherData() {
    this.observers = new ArrayList<>();
  }

  @Override
  public void registerObserver(Observer observer) {
    if (observer != null) {
      observers.add(observer);
    }
  }

  @Override
  public void removeObserver(Observer observer) {
    int index = observers.indexOf(observer);
    if (index > 0) {
      observers.remove(observer);
    }
  }

  @Override
  public void notifyObservers() {
    observers.stream().forEach(o -> o.update(temperature, humidity, pressure));
  }

  public void measurementsChanged(){
    notifyObservers();
  }

  public void setMeasurements(float temperature,float humidity,float pressure){
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }

  public float getTemperature() {
    return temperature;
  }

  public float getHumidity() {
    return humidity;
  }

  public float getPressure() {
    return pressure;
  }
}
