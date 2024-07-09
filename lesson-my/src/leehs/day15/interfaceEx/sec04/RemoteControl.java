package day15.interfaceEx.sec04;

public interface RemoteControl {

  //상수 필드
  public static final int MAX_VOLUME = 10;
  int MIN_VOLUME = 0;
  int MIDDLE_VOLUME = 5;

  //추상 메소드
  void turnOn();

  void turnOff();

  void setVolume(int volume);

  //디폴트 인스턴스 메소드 :상수 필드를 읽거나 추상 메소드를 호출하는 코드 작성하기 위해
  default void setMute(boolean mute) {
    if (mute) {
      System.out.println("쉿 조용히!");
      setVolume(MIN_VOLUME);
    } else {
      System.out.println("무음 해제");
      setVolume(MIDDLE_VOLUME);
    }


  }

}