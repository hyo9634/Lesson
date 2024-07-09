package day9.section7;

public class ArrayCopyByForExample {

  public static void main(String[] args) {
    //길이 3인 배열
    String[] sourceArray = {"java", "backend", "programming"};

    //길이 5인 배열을 새로 생성
    String[] targetArray = new String[5];

    //배열 항목 복사
    System.arraycopy(sourceArray, 0, targetArray, 0, targetArray.length - 2);

    //배열 항목 출력 (향상된 for 이용)
    for (String s : targetArray) {
      System.out.printf("%s", s);
    }
  }
}

