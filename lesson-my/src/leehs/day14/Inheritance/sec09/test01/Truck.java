package day14.Inheritance.sec09.test01;

public class Truck extends Wheeler{

  //생성자 생성
  Truck (int velocity, String carName, int wheelNumber) {
    // 자식클래스는 부모클래스에 있는 멤버변수를 사용할 수 있다.
    // 자식 클래스는 부모 클래스에 있는 필드를 super(필드들) 을 이용해서 생성자에 사용할 수 있다.
    super(velocity, carName, wheelNumber);//자식클래스에 따로 선언하지 않고 가져옴
    System.out.println(carName + " : 바퀴 " + wheelNumber + "개입니다.");
  }
  //디폴드 생성자

  public Truck() {
  }

  //오버라이딩

  @Override
  void speedUP(int speed) {
    velocity += speed * 5;
    if(velocity > 100){
      velocity = 100;
    }
    System.out.println(carName + "의 현재 속도는 " + velocity + " 입니다.");

  }

  @Override
  public void stop() {
    super.stop();
  }

  @Override
  void speedDown(int speed) {
    velocity -= speed * 5;
    if(velocity < 50){
      velocity = 50;
    }
    System.out.println(carName + "의 최저속도위반으로 속도를 " + velocity + "으로 올립니다.");


  }
}
