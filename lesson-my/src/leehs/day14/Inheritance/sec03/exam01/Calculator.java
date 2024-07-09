package day14.Inheritance.sec03.exam01;

public class Calculator {

  //메소드 선언 :  return value : double  method name: areaCircle(double r)
  //areaCircle 메소드는 반지름을 받아 원의 면적을 계산하는 기능이다.  PI는 Math.PI를 사용한다.

  public double areaCircle(double radius) {
    double area = radius * radius * Math.PI;
    return area;
  }
}