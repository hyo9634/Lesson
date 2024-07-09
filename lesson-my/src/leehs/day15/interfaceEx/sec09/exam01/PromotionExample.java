package day15.interfaceEx.sec09.exam01;

public class PromotionExample {

  public static void main(String[] args) {
    //구현 객체 생성
    B b = new B();
    D d = new D();
    C c = new C();
    E e = new E();

    //인터페이스 변수 선언
    A a;

    //변수에 구현 객체 대입
    a = b;
    a = c;
    a = d;
    a = e;

  }
}