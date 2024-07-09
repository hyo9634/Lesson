package day10.section1;

public class UserMain {

  public static void main(String[] args) {
    User me = new User("서유미", "0000000000");
    System.out.println("국적 : " + me.nation + " " + me.name + " " + me.ssn);
  }
}
