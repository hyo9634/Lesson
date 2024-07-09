package day9.section1;

public class SbEx {

  public static void main(String[] args) {
    //StringBuffer , StringBuilder 클래스는 문자열 연산(연결,변경,수정)에 주로 활용된다.

    //String 클래스  +, concat() : 문자열을 이어 붙어서 사용함

    StringBuffer sb = new StringBuffer();
    sb.append("hello");
    sb.append(" StrinBuffer");
    sb.append(" Nice meet you");
    sb.append(" !!!");
    String result = sb.toString();
    System.out.println(result);   // 내부적으로 버퍼(buffer)가 제공되어 문자열 연산을 하여 제공하여 최종 결과를 만들때 사용 (연산속도 빠르다)

    String str1 = "ABCDEFGHIJKLMN";
    StringBuffer sb1 = new StringBuffer(str1);
    System.out.println(sb1);
    //sb1 String type 로 casting 하세요
    String str2 = sb1.toString();
    String str3 = sb1.substring(3, 10);
    System.out.println(str3);
    sb1.insert(2, "OPQRSTU");
    String str4 = sb1.toString();
    System.out.println(str4);
    //현재 sb1의 문자열에서 문자 O부터 I 까지 삭제한 결과값 출력 "ABJKLMN" delete

    //현재 sb1 문자열에  "ABJKLMN" ==> "ABJKLMNOPQRSTU" 로 변경연산 하기 append

    //현재 sb1의 문자열의 총길이 출력

    //현재 sb1의 용량(capacity) 출력

    //현재 sb1의 문자열을 뒤집어 출력하기

  }
}
