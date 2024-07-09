package day15.interfaceEx.sec06;

public interface Service {

  //디폴트 메소드
  default void defaultMethod1() {
    System.out.println("나는 default Method1 이고 구현부 실행! ");
    defaultCommon();
  }

  default void defaultMethod2() {
    System.out.println("나는 default Method2 이고 구현부 실행! ");
    defaultCommon();
  }

  //private 메소드
  private void defaultCommon() {
    System.out.println("나는 default common 이고 중복 코드 A 구현부 실행! ");
  }

  //정적 메소드
  static void staticMehod1() {
    System.out.println("나는 staticMethod1 이야");
  }

  static void staticMehod2() {
    System.out.println("나는 staticMethod2 이야");
  }

  //private 정적 메소드
  private static void staticCommon() {
    System.out.println("나는 staticCommon 이야");
  }

}