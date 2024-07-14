package leehs.day18.ObjectEqualsHashcode;

import java.util.Objects;
import lombok.*;

@Data
@AllArgsConstructor
public class Member {

  String name;

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Member member = (Member) o;
    return Objects.equals(name, member.name);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(name);
  }
}
