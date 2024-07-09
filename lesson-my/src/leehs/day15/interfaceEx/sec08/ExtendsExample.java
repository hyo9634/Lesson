package day15.interfaceEx.sec08;

public class ExtendsExample {

  public static void main(String[] args) {
    InterfaceCImpl imple = new InterfaceCImpl();

    InterfaceA ia = imple;
    ia.methodA();

    System.out.println();
    InterfaceB ib = imple;
    ib.methodB();

    System.out.println();
    InterfaceC ic = imple;
    ic.methodA();
    ic.methodB();
    ic.methodA();

  }
}