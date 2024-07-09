package day18.MathEX;

public class MathEX01 {

  public static void main(String[] args) {
    //1. 절대값 반환,Mach.abs
    System.out.println("절댓값 : " + Math.abs(-1));
    System.out.println("-----------------------------");


    //1.4, 1.6, -1.5, 1 : 반올림 Math.round()
    System.out.println("양수 반올림 : " + Math.round(3.4));
    System.out.println("음수 반올림 : " + Math.round(-4.8));
    System.out.println("-----------------------------");

    //1.4, 1.6, -1.5, 1 : 올림 Math.ceil()
    System.out.println("양수 올림 : " + Math.ceil(5.3));
    System.out.println("음수 올림 : " + Math.ceil(-5.3));
    System.out.println("-----------------------------");

    //1.4, 1.6, -1.5, 1 : 내림(버림) Math.floor()
    System.out.println("양수 내림 : " + Math.floor(7.8));
    System.out.println("음수 내림 : " + Math.floor(-7.8));
    System.out.println("-----------------------------");

    //제곱근 : Math.sqrt()
    System.out.println("제곱근 : " + (int) Math.sqrt(25));
    System.out.println("-----------------------------");

    //Math.random() 0.0 <= ~~~ < 1.0 임의의 부동 소수점을 반환
    //1~10까지의 숫자를 랜덤으로 얻고 싶다.
    double random = Math.floor((Math.random() * 10) + 1);
    System.out.println("랜덤 함수 : " + (int)random);
  }

}
