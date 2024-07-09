package day18.ObjectEqualsHashcode;

public class MemberMain {

  public static void main(String[] args) {
    Member m1 = new Member("이효승");
    Member m2 = new Member("이효승");

    System.out.println(m1 == m2);// == : 주소값 비교
    System.out.println(System.identityHashCode(m1));// == : 주소값 비교
    System.out.println(System.identityHashCode(m2));// == : 주소값 비교
    System.out.println(m1.equals(m2));// 값을 비교

    System.out.println("-----------------------");

    Member m3 = m1;
    System.out.println(m1 == m3);// == : 주소값 비교
    System.out.println(System.identityHashCode(m1));// == : 주소값 비교
    System.out.println(System.identityHashCode(m3));// == : 주소값 비교
    System.out.println(m1.equals(m3));// 값을 비교

    System.out.println("-----------------------");

    m1.setName("삼효승");

    System.out.println(m1 == m2);// == : 주소값 비교
    System.out.println(System.identityHashCode(m1));// == : 주소값 비교
    System.out.println(System.identityHashCode(m2));// == : 주소값 비교
    System.out.println(m1.equals(m2));// 값을 비교

    System.out.println("-----------------------");

    System.out.println(m1 == m3);// == : 주소값 비교
    System.out.println(System.identityHashCode(m1));// == : 주소값 비교
    System.out.println(System.identityHashCode(m3));// == : 주소값 비교
    System.out.println(m1.equals(m3));// 값을 비교

  }

}
