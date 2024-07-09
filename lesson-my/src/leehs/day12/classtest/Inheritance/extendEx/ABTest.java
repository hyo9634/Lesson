package day12.classtest.Inheritance.extendEx;

import java.sql.SQLOutput;

class A {

  int aa = 10;

  void aa() {
    System.out.println("A클래스의 aa()");
  }

}

class B extends A {

  int aa = 20;

  void aa() {

    System.out.println("B클래스의 aa()");
  }

  void aaaa() {
    super.aa();
    System.out.println("B클래스의 aa()");
  }

  void aaPrint() {
    System.out.println(super.aa);
  }
}


public class ABTest {

  public static void main(String[] args) {
    A ab = new B();
    System.out.println(ab.aa);
    //ab.aaPrint();
    ab.aa();

  }


}
