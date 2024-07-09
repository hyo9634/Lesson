package day14.Inheritance.sec09.test01;

public class Prob1 {
public static void main(String[] args) {
Wheeler truck = new Truck(0,"트럭",4);//매개변수 사용
Wheeler bike = new Bike(0,"자전거",2);

//메서드를 불러와야지

  truck.speedUP(20);
  bike.speedUP(25);
  truck.speedDown(11);
  bike.speedDown(5);
  truck.stop();
  bike.stop();
  truck.speedUP(10);
}
}
