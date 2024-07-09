package day10.section2;

public class User {  // 국적, 이름, 주민번호   이 필드 중 이름과 주민번호를 입력하여 객체를 생성할 수 있다.

  private String nation = "대한민국";
  private String name;
  private String ssn;

  User() {
  }

  User(String name, String ssn) {
    this.name = name;
    this.ssn = ssn;
  }

  User(String nation, String name, String ssn) {
    this.nation = nation;
    this.name = name;
    this.ssn = ssn;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSsn() {
    return ssn;
  }

  public void setSsn(String ssn) {
    this.ssn = ssn;
  }
}

//실행클래스 UserMain 생성하여 본인객체을 생성하세요. 생성한 후 국적, 이름, 주민번호 출력
