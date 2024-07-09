package day18.WrapperEX;

public class WrapEX01 {

  public static void main(String[] args) {
    // 100값을 객체로 생성해주세요, boxing

    Integer value = 100; //auto boxing, 굳이 생성자를 새로 만들지 않아도 됨
    Boolean b1 = true;
    boolean b2 = b1.booleanValue();

    int v = value.intValue(); //unboxing
    int v1 = value; //auto Unboxing :
    v = v + 100;

    //boxing
    value = v;
    System.out.println(value);

    Integer num1 = 10;
    Integer num2 = 20;
    Integer result1 = num1 + num2;//연산 후 result1에 다시 대입
    System.out.println(result1);





    //객체 값 비교( ==으로 비교 불가, equals로 비교해야함)
    System.out.println(num1.equals(num2));
    System.out.println(num1 < num2);//auto boxing으로 비교 가능
    System.out.println(num1 +num2);//auto boxing으로 비교 가능

    //String타입의 문자를 포장객체가 언박싱할 때
    String str2 = "10.5";
    String str1 = "10";

    int value2 = Integer.parseInt(str1);
    byte value4 = Byte.parseByte(str1);
    short value5 = Short.parseShort(str1);
    long value6 = Long.parseLong(str1);
    float value7 = Float.parseFloat(str2);
    double value3 = Double.parseDouble(str2);

    //Autoboxing 과 기본타입의 연산 과정을 for문 100만건 이상으로 성능평가 코드 돌려보기
  }

}
