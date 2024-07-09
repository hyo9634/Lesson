package day15.interfaceEx.sec02;

public interface RemoteControl {

  //인터페이스는 public static final 특성을 갖고  있는 불변의 상수 필드를 멤버로 가질 수 있다.
  int MAX_VOLUME = 30;   //상수 선언시 새로운 단어시작전 _ (언더바)를 사용하여 선언하는 것(관례)
  public static final int MIN_VOLUME = 0;

}