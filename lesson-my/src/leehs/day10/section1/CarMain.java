package day10.section1;

public class CarMain {   //Car 클래스를 객체를 생성하여 실행하는 클래스

  public static void main(String[] args) {
    // 자동차 클래스 ==> 자동차 객체 한 개를 생성하세요
    Car volvo = new Car();
    // volvo 자동차의 값을 출력하세요.
    System.out.println("company : " + volvo.company);
    System.out.println("model : " + volvo.model);
    System.out.println("color : " + volvo.color);

    Car mycar = new Car("현대기아", "뉴카니발", "White");
    System.out.println("company : " + mycar.company);
    System.out.println("model : " + mycar.model);
    System.out.println("color : " + mycar.color);

  }

}
