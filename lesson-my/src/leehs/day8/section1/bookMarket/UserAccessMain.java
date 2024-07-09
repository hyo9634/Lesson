package day8.section1.bookMarket;

public class UserAccessMain {   //실행 클래스

  public static void main(String[] args) {
    User user1 = new User();
    user1.setId("ssg101");
    user1.setName("신세계");
    user1.setAddress("서울시 강남구 봉은대로");
    user1.setMobileNumber("010-111-1111");
    user1.setPassword("1111");

    System.out.println(user1.getId() + " " + user1.getPassword());
    System.out.println(user1.toString());


  }

}
