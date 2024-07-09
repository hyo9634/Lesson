package day15.interfaceEx.homework.pro1;

public class Dog extends Animal {

  public Dog(int speed) {
    super(speed);
  }

  public void run(int hours) {
    this.distance = (hours * this.speed) / 2;
  }

  public double getDistance() {
    return distance;

  }

}
