package day13.emp.exec;

import day13.emp.vo.RempVO;

public class EmployeeInitTest {

  public static void main(String[] args) {
    RempVO vo1 = new RempVO();
    RempVO vo = new RempVO("홍길동", 30, "010-111-1111", "2024-06-27", true, "홍보부");
    RempVO vo2 = new RempVO("김종민", 35, "010-111-1112", "2024-06-27", false, "개발팀");
    System.out.println(vo.toString());
    System.out.println(vo2.toString());
  }
}
