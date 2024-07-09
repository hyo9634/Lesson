package day14.Inheritance.sec09.test01;

public abstract class Wheeler {

  //필드 선언(protected)
  protected int velocity;
  protected String carName;
  protected int wheelNumber;

  //기본 생성자 선언
  public Wheeler() {

  }

  //생성자 선언
  public Wheeler(int velocity, String carName, int wheelNumber) {
    this.velocity = velocity;
    this.carName = carName;
    this.wheelNumber = wheelNumber;
  }

  //추상 메서드 선언
  abstract void speedUP(int speed);//속도 증가 메서드

  abstract void speedDown(int speed);//속도 감소 메서드

  public void stop() {
    velocity = 0;
    System.out.println("정지상태로 속도를 0으로 초기화 합니다.");
  }
}
