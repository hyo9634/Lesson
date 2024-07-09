package day7.section1;

import java.util.regex.Pattern;

public class TestRex {

  public static void main(String[] args) {
    String userNum1 = "1234";
    String userNum2 = "U1234";
    String REGEXP_ONLY_NUM = "^[\\d]*$";

    Boolean isNumber1 = Pattern.matches(REGEXP_ONLY_NUM, userNum1);
    Boolean isNumber2 = Pattern.matches(REGEXP_ONLY_NUM, userNum2);
    System.out.println(isNumber1);
    System.out.println(isNumber2);
  }

}
