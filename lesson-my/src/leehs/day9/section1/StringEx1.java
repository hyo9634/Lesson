package day9.section1;

public class StringEx1 {

  public static void main(String[] args) {
    //charAt() 메소드를 이용하여  "자바 프로그래밍" 문자열에서 "프로그래밍" 문자열만 추출하여 출력하는 프로그램
    //1. 문자열 저장 2. for문 필요 문자를 해당 인덱스를 지정해서 '프''로''그''래''밍'을 뽑아서 결과 "프로그래밍"
    //3. "프"의 인덱스를 조회하여 직접 인덱스를 지정하지 않고 추출하도록 리팩토링
    //4. charAt()문자를 문자열로 변환하여 concat()메소드로 문자열을 생성하여 출력

    String str1 = new String("자바 프로그래밍");  //8개의 문자열, 인덱스 : 0~7
    String result = "";
    /*for (int i = 3; i < str1.length(); i++) {
      char ch = str1.charAt(i);
      result = result.concat(ch);
      System.out.print(result);
    }
*/
  }

}
