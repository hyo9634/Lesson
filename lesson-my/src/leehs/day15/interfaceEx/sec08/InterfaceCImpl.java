package day15.interfaceEx.sec08;

public class InterfaceCImpl implements InterfaceC {
//인터페이스의 다중 상속

  @Override
  public void methodC() {
    System.out.println("method C");
  }

  @Override
  public void methodA() {
    System.out.println("method A");
  }

  @Override
  public void methodB() {
    System.out.println("method B");
  }
}