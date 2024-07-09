package day14.Inheritance.sec04.exam02;

public class SportsCar extends Car {

  @Override
  public void speedUp() {
    speed += 10;
  }

  // 오버라이딩을 할 수 없음

  public void stop1() {
    System.out.println("스포츠카를 멈춤");
    speed = 0;
  }
}