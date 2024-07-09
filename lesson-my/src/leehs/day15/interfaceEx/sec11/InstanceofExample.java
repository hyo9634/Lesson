package day15.interfaceEx.sec11;

public class InstanceofExample {

  public static void main(String[] args) {
    //구현 객체 생성
    Taxi taxi = new Taxi();
    Bus bus = new Bus();

    //ride() 메소드 호출 시 구현 객체를 매개값으로 전달
    ride(bus);
  }

  //인터페이스 매개변수를 갖는 메소드
  public static void ride(Vehicle vehicle) {
    if (vehicle instanceof Taxi taxi) {
      taxi.run();
    } else if (vehicle instanceof Bus bus) {
      bus.checkFare();
      bus.run();
    }
  }
}