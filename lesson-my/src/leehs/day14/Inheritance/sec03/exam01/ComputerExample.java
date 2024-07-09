package day14.Inheritance.sec03.exam01;

public class ComputerExample {

  public static void main(String[] args) {
    int radius = 10;
    Calculator calculator = new Calculator();
    System.out.println("원 면적 :" + calculator.areaCircle(10));
    System.out.printf("원 면적 : %.2f\n", calculator.areaCircle(10));

    System.out.println("========UpCasting============");
    Calculator calculator2 = new Computer();
    double area = calculator2.areaCircle(20);
    System.out.printf("원 면적 : %.2f", area);

  }
}