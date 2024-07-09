package day10.section2;

public class UserMain {

  public static void main(String[] args) {
    User me = new User("서유미", "0000000000");
    // System.out.println("국적 : " + me.nation + " " + me.name + " " + me.ssn);
    // me 객체의 이름을 "홍길동" 으로 변경하고 ssn 을 "1111111111111" 변경  :setter 변경

    String oldmename = me.getName();
    String oldmessn = me.getSsn();

    me.setName("홍길동");
    me.setSsn("111111111111");
    //변경된 이름과 ssn 을 조회하세요
    System.out.println("변경 전 " + oldmename + " " + oldmessn);
    System.out.println("현재 값" + me.getName() + " " + me.getSsn());
  }
}
