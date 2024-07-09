package day3;

public class CastingEx {
    public static void main(String[] args) {
        /*byte byteValue = 10;
        int intValue = byteValue;
        System.out.println(byteValue + " " + intValue);

        char charValue = 'A';
        int intValue1 = charValue;
        //강제 타입변환 (큰->작) 캐스팅 : casting
        char charValue2 =(char)intValue1;
        System.out.println(intValue1);
        System.out.println(charValue2);

        int v1 = 10302997;
        byte bv1 = (byte)v1;
        System.out.println(v1 + " " + bv1);
        //강제 타입의 목적은? 원래 값이 유지되면서 타입만 바꾸고자 할때

        long longValue = 300;
        int intValue2 = (int)longValue;

        //연산식 자동 타입 변환
        //자바는 실행 속도의 향상을 위해 컴파일 단계에서 연산을 수행한다.
        byte result = 10 + 20;

        //정수 리터럴이 아닌 변수가 오퍼랜드로 사용되면 실행 시 연산을 수행한다.

        byte x = 10;
        byte y = 20;
        int result1 =(int)x +(int)y;

       //실수 : float(4) , double(8)

        double result4 = 1.2f + 3.6;

        *//*intValue3에 10 을 할당
                doubleValue3 에 5.5 할당한 후 두 수를 덧셈한 결과를 result5에 저장하세요*//*

        int intValue3 = 10;
        double doubleValue3 = 5.5;

        double result5 = intValue3 + doubleValue3;   //10.0 + 5.5 = 15.5
        System.out.println(result5);
        int result6 = intValue3 + (int) doubleValue3;
        System.out.println(result6);

        // 1/2 = 0.5
        int one = 1;
        int two = 2;
        double result7 = (double)one / two ;
        double result8 = (double)one /(double) two ;
        double result9 = (double) one/two ;
        System.out.println(result7 + " " + result8 + " " + result9);

        //자바에서 + 연산자의 기능이 두가지
        //1. 피연산자가 모두 숫자일 경우 덧셈연산 수행  2. 피연산자 중 하나가 문자일 경우 나머지 피연자도 문자열로 자동변환되어 문자열 결합 연산 수행

        int op1 = 3 + 7;   //10
        String op2 = "3" + 7;   //37
        String op3 = "3" + "7";   //37

        int op4 = 1 + 2+ 3;   //  3+3= 6
        String op5 = 1 + 2+ "3";   //  1+2 => 3+"3" => "33"
        String op6 = 1 + "2"+ 3;   //  1+"2" => "12"+3 => "123"
        String op7 = "1" + (2+ 3);   // "1"+ (2+3)=>5 => "15"  결합연산한다.
        System.out.println(op5 + " " + op6 + " " + op7);

        //String 타입변환
        int op8 = Integer.parseInt("10");
        System.out.println(op8+10);
        double op9 = Double.parseDouble("3.14");
        System.out.println(op9 + 5.5);

        boolean op10 = Boolean.parseBoolean("true");
        System.out.println(op10);

       //기본 타입으로 바꾼 값을 다시 String 타입으로 변경
        String str1 = String.valueOf(10);
        String str2 = String.valueOf(op9);
        String str3 = String.valueOf(op10);
        System.out.println(str1 + " " + str2 + " " + str3);
*/
      //변수의 유효범위 (Variable Scope) : 해당 변수가 접근 가능한 범위를 의미
      //자바에서는 변수가 선언된 위치에 따라 범위가 결정된다.

//      1. 블럭 내부의 변수
        int  a = 10;
        if(a == 10){
            int b = 20;
            System.out.println("a =" + a + "  b =" + b);
        }
        System.out.println(a);


        //2. 메소드의 내부 변수 : 메서드 내에서 선언된 변수는 메서드 내에서만 유효하다.
        int result = calculator(100,200);
        System.out.println(result);
    }

//    public static void calculator(int n1, int n2){
//        int result = n1 + n2;
//        System.out.printf("%d + %d 의 결과는 %d" , n1,n2,result);
//    }

    public static int calculator(int n1, int n2){
        int result = n1 + n2;
        System.out.printf("%d + %d 의 결과는 %d\n" , n1,n2,result);
        return result;
    }

}
