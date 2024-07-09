package day18.objectEx;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor

public class Address implements Cloneable {
@Setter
  private int code;
  @Setter
  private String addr;

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
