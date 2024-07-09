package day14.Inheritance.sec01;

public class SmartPhone extends Phone {

  //필드 선언

  //생성자 선언. 부모인 Phone의 필드를 생성자를 통해 SmartPhone 생성자 내에서  초기화하시오.
  public SmartPhone(String model, String color) {
		 /*super();
		 this.model = model;
		 this.color = color;*/
    super(model, color);
    System.out.println("smart Phone(String model, String color) 생성자 실행하여 초기화 완료");
  }

  //메소드 선언


}