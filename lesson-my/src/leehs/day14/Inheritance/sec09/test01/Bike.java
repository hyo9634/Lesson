package day14.Inheritance.sec09.test01;

public class Bike extends Wheeler {//1. 상속시키기

  //생성자 생성
  public Bike (int velocity, String carName, int wheelNumber) {
    super(velocity, carName, wheelNumber);

    System.out.println(carName + " : 바퀴 " + wheelNumber + "개입니다.");
  }

  //오버라이딩

  @Override
  void speedUP(int speed) {
  velocity =+ speed;
  if(velocity > 40){
    velocity = 40;
  }
    System.out.println(carName + "의 현재 속도는 " + velocity + " 입니다.");
  }
  //디폴트 생성자 -> 매개변수가 있는 생성자를 사용할 경우 반드시 필요함, 객체를 생성할 경우에 쓰임
  public Bike() {
  }

  @Override
  void speedDown(int speed) {
    velocity =- speed;
    if(velocity < 10){
      velocity = 10;
    }
    System.out.println(carName + "의 최저속도위반으로 속도를 " + velocity + "으로 올립니다.");
  }

  @Override
  public void stop() {
    super.stop();
  }


}
