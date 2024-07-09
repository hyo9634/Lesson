package day11.exec;


import day11.model.Person;
import java.util.Arrays;
import java.util.Scanner;

public class PersonMain {

  public static void main(String[] args) {
    //Q1. 홍길동 회원이 가입했습니다. 회원 정보를 입력받아 객체에 정보를 저장하고 저장된 정보를 출력하세요
    day11.model.Person hong = new day11.model.Person();
    /*hong.name = "홍길동";
    hong.age = 20;
    hong.phone = "0103222-2323";*/
    Scanner sc = new Scanner(System.in);
    System.out.print("이름 = ");
    String name = sc.nextLine();
    sc.nextLine();
    System.out.print("나이 = ");
    int age = sc.nextInt();
    sc.nextLine();
    System.out.print("연락처 = ");
    String phone = sc.nextLine();

    System.out.println(hong.toString());
    hong.eat();
    hong.walk();
    hong.play();
    personInfoPrint(name, age, phone);
    //Q2. 나주인 25 01044449898 회원이 가입했습니다. 회원 정보를 입력받아 정보를 저장하고 저장된 정보를 출력하세요.
    //       이름과 전화번호는 필수이므로 초기화하여 객체를 생성하세요  //생성자 오버로딩

    Person najuin = new Person("나주인", "0104444989");
    najuin.age = 25;

    System.out.println(najuin.toString());
    najuin.eat();
    najuin.walk();
    najuin.play();
    personInfoPrintObject(najuin);

  }

  public static void personInfoPrint(String name, int age, String phone) {

    System.out.println("회원의 이름은 :" + name + " 나이 :" + age + "연락처: " + phone);

  }

  public static void personInfoPrintObject(Person person) {

    System.out.println("회원의 이름은 :" + person.name + " 나이 :" + person.age + "연락처: " + person.phone);

  }
}
