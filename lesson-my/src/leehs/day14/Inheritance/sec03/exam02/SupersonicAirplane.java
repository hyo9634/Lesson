package day14.Inheritance.sec03.exam02;

public class SupersonicAirplane extends Airplane {

  //상수 선언
  public static final int NORMAL = 1;     //상수 처리: final   + static (공용 상수)
  public static final int SUPERSONIC = 2;
  //상태 필드 선언
  private int flyMode = NORMAL;

  //메소드 재정의
  @Override
  public void fly() {
    if (flyMode == SUPERSONIC) {
      System.out.println("초음속 비행합니다.");
    } else {
      //Airplane 객체의 fly() 메소드 호출
      super.fly();
    }
  }

  public int getFlyMode() {
    return flyMode;
  }

  public void setFlyMode(int flyMode) {
    this.flyMode = flyMode;
  }
}