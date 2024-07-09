package day9.section3;

public class CharAtExample {

  public static void main(String[] args) {
    //1
    String ssn = "0106241230123";

    for (int i = 6; i < ssn.length(); i++) {
      System.out.print(ssn.charAt(i));
    }

    //2. 주민번호에서 성별 추출하기
    String regNum = "9909281234567";
    char genderNum = regNum.charAt(6);

    if (genderNum == '1' || genderNum == '3') {
      System.out.println("남성");
    } else if (genderNum == '2' || genderNum == '4') {
      System.out.println("여성");
    } else {
      System.out.println("외국인 or 입력값 오류");
    }
  }
}
