package observer.simpleobservable;



public class Example {
  public static void main(String[] args) {
    SimpleSubject simpleSubject = new SimpleSubject();

    SimpleObservable simpleObserver = new SimpleObservable(simpleSubject);

    simpleSubject.setValue(80);
  }
}
