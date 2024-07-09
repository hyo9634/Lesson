package day14.Inheritance.sec02.exam02;

public class SmartPhone extends Phone {

  private boolean wifi;

  //생성자 선언, 부모의 필드 초기화하고, 자신의 wifi필드를 초기화 해주세요
  public SmartPhone() {
  }

  public SmartPhone(String model, String color, boolean wifi) {
    super(model, color);
    this.wifi = wifi;
  }

  public String getWifi() {
    String messge = "";
    if (this.wifi == true) {
      messge = "Wifi 사용중";
    } else {
      messge = "wifi 꺼짐";
    }
    return messge;
  }

  public void setWifi(boolean wifi) {
    this.wifi = wifi;
    
    if (this.wifi == true) {

      System.out.println("Wifi 상태정보 on ");
    } else {
      System.out.println("Wifi 상태정보 off ");
    }
  }

}