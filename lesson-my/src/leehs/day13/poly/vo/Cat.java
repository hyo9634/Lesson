package day13.poly.vo;

public class Cat extends Animal {

  public Cat() {

    super();    //new Animal;
  }

  //Override (재정의) : Super Class의 동일한 이름을 가진(파라미터,파라미터 타입 까지 똑같아야 함) 메서드를 재정의
  public void eat() {
    int age = super.age;
    System.out.println("Cat eat!");
  }

  public void night() {
    System.out.println("밤에는 고양이눈이 빛반사를 해서 갑자기 마주치면 너무 무섭다.");
  }

}
