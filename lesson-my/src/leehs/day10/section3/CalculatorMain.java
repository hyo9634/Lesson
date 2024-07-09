package day10.section3;

public class CalculatorMain {

  public static void main(String[] args) {
    //1. 계산기 한개를 생성합니다.
    Calculator calculator = new Calculator();

    //2. 계산기의 전원을 켭니다.
    calculator.powerOn();

    //3. 두 개의 정수를 전달하여 계산한 결과값을 출력
    int result = calculator.plus(10, 20);
    System.out.printf("결과 값: %d\n", result);
    //4. 두 개의 실수를 전달하여 계산한 결과값을 출력
    double result1 = calculator.divide(50, 10);
    System.out.println(result1);
    result1 = calculator.divide(50, 0);
    System.out.println(result1);

    //5. 계산기의 전원을 끕니다.
  }

}
