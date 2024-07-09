package day13.poly;

import day13.poly.vo.Animal;
import day13.poly.vo.Cat;
import day13.poly.vo.Dog;

public class PolyMethodTest {

  public static void main(String[] args) {
    Dog d = new Dog();
    Cat cat = new Cat();
    // display(d);   //부모타입에게 자식타입의 객체를 전달한다. 부모자식 관계일때 던질 수 있다.
    Animal[] animals = new Animal[2];
    animals[0] = d;
    animals[1] = cat;
    display1(animals);
  }


  public static void display(Animal animal) { //다형성 인수 : 하나의 타입으로 여러가지 타입을 받을 수 있다.
    animal.eat();
    if (animal instanceof Cat) {   //객체의 타입을 검사할때 instacneof
      ((Cat) animal).night();
    }
  }

  public static void display1(Animal[] animal) { //다형성 인수 : 하나의 타입으로 여러가지 타입을 받을 수 있다.
    for (Animal ani : animal) {

      ani.eat();
      if (ani instanceof Cat) {   //객체의 타입을 검사할때 instacneof
        ((Cat) ani).night();
      }

    }
  }


}
