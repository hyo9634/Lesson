package day14.Inheritance.sec09.exam01;

public abstract class Phone {

  //필드 선언
  String owner;

  Phone() {
  }

  //생성자 선언
  public Phone(String owner) {
    this.owner = owner;
  }

  abstract void sendVoice(); //추상메서드

  abstract void resiveVoice(); //추상메서드

  void calling() {
  }

  ;  //{ } 설정이 되면 구현메서드로 봄

  //메소드 선언
  void turnOn() {
    System.out.println("폰 전원을 켭니다.");
  }

  void turnOff() {
    System.out.println("폰 전원을 끕니다.");
  }
}