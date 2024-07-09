package day14.Inheritance.sec03.exam01;

public class Computer extends Calculator {

  //메소드 오버라이딩
  // areaCircle 메소드는 반지름을 받아 원의 면적을 계산하는 기능이다.  PI는 Math.PI를 사용한다.

  @Override   // 컴파일 시 정확히 오버라이딩이 되었는지 체크하는 표식 : 애너테이션, 어노테이션
  public double areaCircle(double radius) {
    System.out.println("Computer 의 areaCicle() 실행!");
    double area = super.areaCircle(radius);
    System.out.printf("부모의 areaCicle() 실행 결과  %.2f\n: ", area);
    return radius * radius * Math.PI;
  }
}