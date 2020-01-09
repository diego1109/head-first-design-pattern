package observer.simple;

import java.util.ArrayList;
import java.util.List;

public class SimpleSubject implements Subject {

  //  主题中要维护一个观察者列表
  private List<Observer> observers;
  private int value = 0;

  public SimpleSubject() {
    this.observers = new ArrayList();
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
    observers.stream().forEach(o -> o.update(value));
  }

  public void setValue(int value) {
    this.value = value;
    notifyObservers();
  }
}
