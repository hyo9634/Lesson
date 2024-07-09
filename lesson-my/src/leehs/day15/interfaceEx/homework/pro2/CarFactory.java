package day15.interfaceEx.homework.pro2;

;

public class CarFactory extends Factory implements IWorkingTogether {

  public CarFactory(String name, int opeHour, int closeHour) {
    super(name, opeHour, closeHour);
  }

  @Override
  int makeProducts(char skill) {

    switch (skill) {
      case 'A':
        return super.getWorkingTime() * 3;
      case 'B':
        return super.getWorkingTime() * 2;
      case 'c':
        return super.getWorkingTime() * 1;
      default:
        return super.getWorkingTime() * 0;
    }
  }

  @Override
  public int workTogether(IWorkingTogether partner) {
    return this.makeProducts('B');
  }

}