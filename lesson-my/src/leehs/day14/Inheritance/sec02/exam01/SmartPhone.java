package day14.Inheritance.sec02.exam01;

public class SmartPhone extends Phone {

  //자식 생성자 선언

  public SmartPhone() {
  }

  public SmartPhone(String model, String color) {
    super(model, color);
    System.out.println("SmartPhone의 SmartPhone(String model, String color) 초기화 완료!");
  }


}