package leehs.day18.objectEx;

public class MemberCloneTest {

  public static void main(String[] args) {
    Member member1 = new Member("ssg", 29, new Address(10101,"서울시 영등포구"));
    try{

      Member member2 = member1.clone();
      Address address1 = member1.getAddr();
      Address address2 = member2.getAddr();
      //address2.setAddr("충청북도 제천시");
      //System.out.println("Member1 hashcode : %s, addr : %s\n" , member1, member1.getAddr());
      //System.out.println("Member2 hashcode : %s, addr : %s\n" , member2, member2.getAddr());
      System.out.printf("address1 hashcode : %s, addr : %s\n", address1, address1.getAddr());
      System.out.printf("address1 hashcode : %s, addr : %s\n", address2, address2.getAddr());

      System.out.println("=====================================");
      //얕은 복사
      System.out.println(member1);
      System.out.println(member2);
      System.out.println("=====================================");
      address1 = new Address(10002, "서울시 금천구");
      String addr =  address1.getAddr();//객체 주소값 복사
      address1.setAddr(addr);
      member2.setAddr(address1);
      System.out.println(member2);


    }catch (CloneNotSupportedException e){
      throw new RuntimeException(e);
    }


  }

}
