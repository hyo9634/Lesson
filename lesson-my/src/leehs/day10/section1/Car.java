package day10.section1;

public class Car {

  //필드 선언  , 회사, 모델, 차량번호,차량색상,최대속력, 속력
  String company = "Volvo";
  String model = "V3-1003";
  String carNumber = "1234567";
  String color = "black";
  int maxSpeed = 300;
  int speed;

  //생성자 오버로딩
  Car() {
  }   // 디폴트 생성자

  Car(String company, String model, String color) {
    this.company = company;
    this.model = model;
    this.color = color;
  }
  //메소드 선언

}
