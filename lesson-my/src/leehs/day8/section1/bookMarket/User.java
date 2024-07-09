package day8.section1.bookMarket;

public class User { //VO(value Object)

  //아이디
  private String id;
  //이름
  private String name;
  //폰번호
  private String mobileNumber;
  //주소
  private String address;
  //비밀번호
  private String password;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "User{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        ", mobileNumber='" + mobileNumber + '\'' +
        ", address='" + address + '\'' +
        ", password='" + password + '\'' +
        '}';
  }
}
