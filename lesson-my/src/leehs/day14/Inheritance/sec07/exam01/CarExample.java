package day14.Inheritance.sec07.exam01;

public class CarExample {

  public static void main(String[] args) {
    //Car 객체 생성
    Car mycar = new Car();

    //Tire 객체 장착
    mycar.tire = new Tire();
    mycar.running();

    //HankookTire 객체 장착

    mycar.tire = new HankookTire();
    mycar.running();
    //KumhoTire 객체 장착
    mycar.tire = new KumhoTire();
    mycar.running();

  }
}