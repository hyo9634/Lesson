package day7.section1;

import java.sql.SQLOutput;
import java.util.regex.Pattern;

public class TestRegxEx {

  public static void main(String[] args) {
    ex04_10();
  }

  public static void ex04_10() {
    int answer = (int) (Math.random() * 100) + 1; //1~100까지의 랜덤한 수
    String input = ""; // 사용자 입력 값
    int count = 0; // 시도한 횟수

    java.util.Scanner s = new java.util.Scanner(System.in);

    do {
      count++;
      System.out.print("1과 100사이의 값을 입력하세요 :");
      input = s.nextLine();
      System.out.println(input);
      String REGEXP_ONLY_NUM = "^[0-9]*$";
      Boolean isNumber = Pattern.matches(REGEXP_ONLY_NUM, input);
      Boolean isNumber2 = "11111".matches(input);
      System.out.println(isNumber);
      if (!isNumber) {
        System.out.println("다시 입력해주세요. 형식이 맞지 않습니다.");
      } else {

        if (Integer.parseInt(input) > answer) {
          System.out.println("더 작은 수를 입력하세요.");
        } else if (Integer.parseInt(input) < answer) {
          System.out.println("더 큰 수를 입력하세요.");
        } else {
          System.out.println("맞췄습니다.");
          System.out.println("시도횟수는 " + count + "번입니다.");
          break;
        }
      }
    }
    while (true);
  }
}
