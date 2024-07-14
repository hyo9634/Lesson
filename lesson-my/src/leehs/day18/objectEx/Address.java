package leehs.day18.objectEx;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor

public class Address implements Cloneable {
@Setter
  private int code;//학번
  @Setter
  private String addr;//주소

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();//재정의하지 않은 오버라이드
  }
}
