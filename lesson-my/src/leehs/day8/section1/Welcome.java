package day8.section1;

import java.util.Scanner;

public class Welcome {

  private static Welcome W = new Welcome();
  private static Scanner scanner;
  // private  static User u;

  public Welcome() {
    System.out.println("static welcom start");
    Init();
  }


  public static void main(String[] args) {

    System.out.println("main 시작");
    System.out.println("main  scanner");


  }

  private void Init() {
    System.out.println("초기화 시작");
    scanner = new Scanner(System.in);
    System.out.println("Init 시작");
    System.out.print("입력");
    int number = scanner.nextInt();
    System.out.println("number = " + number);


  }


}
