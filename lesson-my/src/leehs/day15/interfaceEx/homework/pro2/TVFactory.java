package day15.interfaceEx.homework.pro2;

public class TVFactory extends Factory implements IWorkingTogether {

  public TVFactory(String name, int openHour, int closeHour) {
    super(name, openHour, closeHour);
  }

  @Override
  int makeProducts(char skill) {

    switch (skill) {
      case 'A':
        return super.getWorkingTime() * 8;
      case 'B':
        return super.getWorkingTime() * 5;
      case 'C':
        return super.getWorkingTime() * 3;
      default:
        return super.getWorkingTime() * 1;
    }
  }

  @Override
  public int workTogether(IWorkingTogether partner) {
    return this.makeProducts('C');

  }

}
