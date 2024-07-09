package day11.addressprogram;

import day11.addressprogram.service.Menue;
import java.io.IOException;
import java.util.Scanner;

public class AddressMain {

  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);

    Menue m = new Menue();

    while (true) {
      m.showMenue();
      String a = sc.next();
      m.choiceMenue(a);

      System.out.println("-------------------");
    }


  }

}
