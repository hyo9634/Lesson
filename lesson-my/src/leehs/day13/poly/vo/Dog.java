package day13.poly.vo;

public class Dog extends Animal {

  public Dog() {
    super();    //new Animal;
  }

  //Override (재정의) : Super Class의 동일한 이름을 가진(파라미터,파라미터 타입 까지 똑같아야 함) 메서드를 재정의
  public void eat() {

    System.out.println("Dog eat!");
  }

}
