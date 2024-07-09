package day13.emp.vo;

public class Employee {

  private String name;
  private int age;
  private String phone;
  private String empDate;
  private String dept;
  private boolean marriage;

  public Employee() {
  }

  public Employee(String name, int age, String phone, String empDate, boolean marriage,
      String dept) {
    this.name = name;
    this.age = age;
    this.phone = phone;
    this.empDate = empDate;
    this.marriage = marriage;
    this.dept = dept;
  }

  public Employee(String name, int age, String phone) {
    this.name = name;
    this.age = age;
    this.phone = phone;

  }

  @Override
  public String toString() {
    return "Employee{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", phone='" + phone + '\'' +
        ", empDate='" + empDate + '\'' +
        ", dept='" + dept + '\'' +
        ", marriage=" + marriage +
        '}';
  }
}
