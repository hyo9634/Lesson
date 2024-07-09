package day15.interfaceEx.homework.pro2;

public abstract class Factory {

  String name;
  int openHour;
  int closeHour;

  public Factory(String name, int openHour, int closeHour) {
    this.name = name;
    this.openHour = openHour;
    this.closeHour = closeHour;

  }

  public String getFactoryName() {
    return this.name;
  }

  public int getWorkingTime() {
    return this.closeHour - this.openHour;
  }

  abstract int makeProducts(char skill);
}
