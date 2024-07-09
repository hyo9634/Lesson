package day12.classtest;

public class Q16 {

  public static void main(String[] args) {
    MemberService memberService = new MemberService();
    boolean result = memberService.login("hong", "12345");
    if (result) {
      System.out.println("로그인 되었습니다.");
      memberService.logout("hong");
    } else {
      System.out.println("아이디 나 비밀번호가 맞지 않습니다.");
    }
  }

}
