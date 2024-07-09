package day12.classtest.Inheritance.extendEx;


class GrandFather {

  void printGrandFather() {
    System.out.println("나의 할아버지 입니다.");
  }
}

class SubFather extends GrandFather {

  String familyName = "홍";
  String houseAddress = "인천";

  void printFather() {
    System.out.println("나는 아버지 입니다. 나는 할아버지로부터 상속 받습니다.");
  }
}

class SubSon extends SubFather {

  void printSon() {
    System.out.println("나는 아들입니다.");
    System.out.println("나는 아버지로부터 상속 받습니다.");
    System.out.println("나는 아버지는 프로그래머 입니다.");
    System.out.println("나의 집은  " + super.houseAddress + " 입니다.");
  }
}

public class Inheritance03 {

  public static void main(String[] args) {
    SubSon objSon = new SubSon();
    objSon.printSon();
    objSon.printFather();
    objSon.printGrandFather();
  }

}
