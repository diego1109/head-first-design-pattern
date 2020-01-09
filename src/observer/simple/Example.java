package observer.simple;

import sun.java2d.pipe.SpanShapeRenderer.Simple;

public class Example {
  public static void main(String[] args) {
    SimpleSubject simpleSubject = new SimpleSubject();

    SimpleObserver simpleObserver = new SimpleObserver(simpleSubject);

    simpleSubject.setValue(80);
  }
}
