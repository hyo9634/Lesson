package day15.interfaceEx.homework.pro1;

public class AnimalTest {

  public static void main(String[] args) {
    Animal dog = new Dog(8);
    Animal chicken = new Chicken(3);
    Chicken cheatableChicken = new Chicken(5);

    if (cheatableChicken instanceof Cheatable) {
      cheatableChicken.fly();
      for (int i = 0; i < 3; i++) {
        System.out.println(i + 1 + "시간 후");
        dog.run(i + 1);
        System.out.println("개의 이동거리 =" + dog.distance);
        chicken.run(i + 1);
        System.out.println("닭의 이동거리 =" + chicken.distance);
        cheatableChicken.run(i + 1);
        System.out.println("날으는 닭의 이동 거리 =" + cheatableChicken.distance);
      }

    }
  }
}

