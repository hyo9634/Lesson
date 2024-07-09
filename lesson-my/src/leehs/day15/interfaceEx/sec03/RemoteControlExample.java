package day15.interfaceEx.sec03;

public class RemoteControlExample {

  public static void main(String[] args) {
    //인터페이스 변수 선언
    RemoteControl remoteControl;
    Audio myaudio = new Audio();
    remoteControl = myaudio;
    remoteControl.turnOn();
    remoteControl.setVolume(20);
    remoteControl.turnOff();

    //Television 객체를 생성하고 인터페이스 변수에 대입
    RemoteControl remoteControl1;
    //Audio 객체를 생성하고 인터페이스 변수에 대입
    remoteControl1 = new Television();
    remoteControl1.turnOn();
    remoteControl1.setVolume(20);
    remoteControl1.turnOff();

  }
}