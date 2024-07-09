package day13.emp.vo;

public class RempVO extends Employee {

  public RempVO() {
    super();
  }

  public RempVO(String name, int age, String phone, String empDate, boolean marriage, String dept) {
    super(name, age, phone, empDate, marriage, dept);
//    this.name = name;
//    this.age = age;
//    this.phone = phone;
//    this.empDate = empDate;
//    this.marriage = marriage;
//    this.dept = dept;

  }

  public RempVO(String name, int age, String phone) {
    super(name, age, phone);
  }
}
