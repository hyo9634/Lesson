package leehs.day18.objectEx;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Member implements Cloneable{//Cloneable로 인스턴스 해주기
  private String name;
  private int age;
  //private String address;
  private Address addr;//사용자가 정한 값을 가지고 있음, 참조변수로

  @Override
  protected Member clone() throws CloneNotSupportedException {//내 자신으로 Member타입 리턴해주는 Object의 clone메소드를 오버라이딩(재정의) 한 메소드

    try {//깊은 복사, 새로운 공간을 만들어야함
      Object clonedAddress = addr.clone();
      Address addrs = (Address) clonedAddress;//다운캐스팅
      Member cloneMember = (Member)super.clone();//
      cloneMember.setAddr(addrs);
      return cloneMember;
    } catch (CloneNotSupportedException e) {
      return null;//객체없는 것을 null값
    }
  }

  @Override
  public String toString() {
    return "Member{" +
        "name='" + name + '\'' +
        ", age=" + age + '\'' + this.hashCode() +
        '}';
  }
}


