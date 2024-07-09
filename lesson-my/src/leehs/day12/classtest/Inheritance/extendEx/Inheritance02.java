package day12.classtest.Inheritance.extendEx;


import java.sql.SQLOutput;

class Father {

  String familyName = "홍";
  String houseAddress = "인천";
}

class Son extends Father {

  String name = "길동";

  void printDetails() {
    System.out.println("나의 이름은" + super.familyName + this.name);
    System.out.println("나의 아버지는 프로그래머");
    System.out.println("나의 집은" + super.houseAddress);
  }
}


public class Inheritance02 {

  public static void main(String[] args) {
    Son objSon = new Son();
    objSon.printDetails();
  }

}
