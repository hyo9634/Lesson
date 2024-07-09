package day9.section3;

public class IndexOfContainsExample {

  public static void main(String[] args) {
    String subject = "자바 객체 프로그래밍 과목입니다.";

    //1. 객체 프로그래밍만 추출하여 출력
    System.out.println(subject.substring(3, 11));

    //2. 프로그래밍 인덱스 저장하여 "프로그래밍 과목입니다" 출력
    int firstIndex = subject.indexOf("프");
    System.out.println(subject.substring(firstIndex));

    //3. 문자열에 "자바" 문자열이 있는 지 판별하기
    String java = "자바";
    String[] arr = subject.split(" ");
    boolean isJava = checkJava(java, arr);
    System.out.println(isJava ? "자바 관련 과목이군요!" : "자바와 관련 없는 과목이군요!");

    //4.  문자열에 "자바" 문자열이 포함 돼 있는 지 판별하기
    System.out.println(subject.contains(java) ? "자바 관련 과목이군요!" : "자바와 관련 없는 과목이군요!");
  }

  public static boolean checkJava(String java, String arr[]) {
    for (String s : arr) {
      if (java.equals(s)) {
        return true;
      }
    }
    return false;
  }
}
