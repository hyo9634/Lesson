package day17.Exception;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

public class ExceptionEx01 {
//@Getter : 컴파일 시 필드들에 대한 getter 메서드를 생성
//@Setter : 컴파일 시 필드들에 대한 setter 메서드를 생성
//@ToString : 컴파일 시 필드들에 대한 toString 메서드 생성
//@EqualsAndHashCode
//@RequiredArgsConstructor
//@Data : 위 4가지를 모두 아우르는 것, 4가지를 Data 하나로 처리가능
//@AllArgsConstructor :
  public static void main(String[] args) {

    printLengthString("JavaDATABASE_PROGRAMMING");
    printLengthString("null");

  }
  public static void printLengthString(String data){
//예외가 발생할 부분을 try catch finally로 감싸주기

    int result = 0;
    try {//예외가 발생할 것 같은 코드 작성
      result = data.length();
      System.out.println("문자 수 : " + result);

      Class.forName("Java.lang.String");
    } catch (NullPointerException e) {//예외정보를 얻어서 도와드리겠삼
      //catch ([발생할 것 같은 예외(예외클래스지정,예외의종류)] [예외 변수 이름(예외객체를받기위한변수)]) {예외 발생 시 실행할 코드}
      //정보를 얻어내는 3가지 방법(처리하는 방법들이 다름
      //1. System.err.println(e.getMessage());
      //2. System.out.println(e.toString());
      //3. e.printStackTrace();
    }catch (ClassNotFoundException e){
      e.printStackTrace();
      System.out.println("null 예외 처리 끝");
    } finally {
      System.out.println("마무리하삼");
    }




  }

}
