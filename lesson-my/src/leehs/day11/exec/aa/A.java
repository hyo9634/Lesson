package day11.exec.aa;

public class A {

  public String aa = "A클래스의 aa";

  public void aa() {
    System.out.println("A클래스의 aa() 메소드 실행");
  }

  @Override
  public String toString() {
    return "A{" +
        "aa='" + aa + '\'' +
        '}';
  }
}
