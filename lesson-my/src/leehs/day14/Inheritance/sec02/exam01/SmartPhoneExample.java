package day14.Inheritance.sec02.exam01;

public class SmartPhoneExample {

  public static void main(String[] args) {
    //SmartPhone 객체 생성
    SmartPhone smartPhone1 = new SmartPhone("아이폰15 PRO", "WHITE");
    System.out.println(smartPhone1.getModel() + "  " + smartPhone1.getColor());
    System.out.println();
    System.out.println("private 의 필드의 값 리셋은 setter 를 통해서 ");
    smartPhone1.setColor("black");
    smartPhone1.setModel("아이폰 16 Pro");
    System.out.println(smartPhone1.getModel() + "  " + smartPhone1.getColor());
  }
}