package day14.Inheritance.sec05.package1;

public class B extends A {

  //메소드 선언
  public void method() {
    A a = new A();  //0
    a.field = "value";  //0
    a.method();  //0
  }
}

//B클래스는 A클래스와 같은 패키지에 있기 때문에 A의 protected 필드, 생성자, 메소드에 접근할 수 있다.