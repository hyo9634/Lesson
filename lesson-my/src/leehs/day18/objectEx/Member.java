package day18.objectEx;


import lombok.AllArgsConstructor;
import lombok.Data;
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
  protected Member clone() throws CloneNotSupportedException {//내 자신으로

    try {//깊은 복사
      Object clonedAddress = addr.clone();
      Address addr = (Address) clonedAddress;
      Member cloneMember = (Member)super.clone();
      cloneMember.setAddr(addr);
      return cloneMember;
    } catch (CloneNotSupportedException e) {
      return null;
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


