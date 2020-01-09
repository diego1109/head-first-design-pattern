package observer.simple;

public class SimpleObserver implements Observer {

  //  观察着中需要维护（组合）一个主题
  private Subject simpleSubject;
  private int value;

  //  观察者构造的时候要初始化主题，并且把它自己给注册了。
  public SimpleObserver(Subject subject) {
    this.simpleSubject = subject;
    this.simpleSubject.registerObserver(this);
  }

  @Override
  public void update(int value) {
    this.value = value;
    display();
  }

  private void display() {
    System.out.println("Value: " + value);
  }
}
