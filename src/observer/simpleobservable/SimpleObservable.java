package observer.simpleobservable;

import java.util.Observable;
import java.util.Observer;

public class SimpleObservable implements Observer {

  private int value;
  private Observable observable;

  //  注意：观察者的构造函数中要初始化主题并且要把自己注册了
  public SimpleObservable(Observable observable) {
    this.observable = observable;
    this.observable.addObserver(this);
  }

  @Override
  public void update(Observable o, Object arg) {
    this.value = (int) arg;
    display();

    if (o instanceof SimpleSubject) {
      SimpleSubject simpleSubject = (SimpleSubject) o;
      this.value = simpleSubject.getValue();
      display();
    }
  }

  private void display() {
    System.out.println("Value: " + value);
  }
}
