package day11.util;

import day11.dto.CarVo;

public class CarUtility {

  public void carPrint(CarVo car) {
    System.out.println(car.carName + "\t" + car.carOwner + "\t" + car.carPrice);
  }

}
