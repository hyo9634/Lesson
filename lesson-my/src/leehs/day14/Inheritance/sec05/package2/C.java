package day14.Inheritance.sec05.package2;

import day14.Inheritance.sec05.package1.A;
import day14.Inheritance.sec05.package1.B;

public class C extends B {

  //메소드 선언
  public void method() {
   /* A a = new A();    //x
    a.field = "value";    //x
    a.method();      //x*/
  }
}

//C클래스는 A클래스와 다른 패키지에 있기 때문에 A의 protected 필드, 생성자, 메소드에 접근할 수 없다.