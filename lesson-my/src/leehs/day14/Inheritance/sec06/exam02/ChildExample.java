package day14.Inheritance.sec06.exam02;

import day14.Inheritance.sec06.exam02.Parent;

public class ChildExample {

  public static void main(String[] args) {
    //자식 객체 생성
    Child child = new Child();
    //자동 타입 변환  Promotion 하세요
    Parent parent = child;

    //메소드 호출  : 메소드 호출해 주세요. method1(),method2(),method3())
    parent.method1();
    parent.method2();
    //parent.method3();

  }
}