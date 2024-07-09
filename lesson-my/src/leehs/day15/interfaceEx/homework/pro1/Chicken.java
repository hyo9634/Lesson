package day15.interfaceEx.homework.pro1;

public class Chicken extends Animal implements Cheatable {

  public Chicken(int speed) {
    super(speed);
  }

  @Override
  void run(int hours) {
    this.distance = hours * this.speed;

  }

  public void fly() {
    this.speed = this.speed * 2;
  }

  public double getDistance() {
    return distance;

  }

}
