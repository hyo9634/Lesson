package day13.poly.vo;

public class Animal extends Object {

  protected int age = 10;

  public Animal() {
    super();    //new Object;
  }

  public void eat() {
    System.out.println("Animal eat!");   //추상적인 개체 (대분류)
  }

}
