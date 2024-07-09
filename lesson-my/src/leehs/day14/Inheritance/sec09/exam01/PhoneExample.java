package day14.Inheritance.sec09.exam01;

public class PhoneExample {

  public static void main(String[] args) {
    Phone phone = new SmartPhone("ssg");
    phone.turnOn();
    phone.calling();
    phone.sendVoice();
    phone.resiveVoice();
    phone.turnOff();


  }
}