package day2;

public class VDATest1 {
    public static void main(String[] args) {
        int age;
        double value;
        int score = 90;
        //문자타입은 하나의 문자 '' ==> 문자리터럴은 유니코드로 저장 된다.
        //유니코드 세계 각국의 문자를 0~65535 숫자로 매핑한 국제 표준 규약
        //자바는 유니코드를 저장할 수 있도록 char 타입을 제공한다.

        char var1 = 'A';   //숫자 : 65
        char var2 = 65;
        char var3 = '가';   //가는 44032 대입
        char var4 = 44032;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);

        String str = "";
        char c = ' ';  //공백의 유니코드 : 32  숫자형변수는 반드시 실제값을 할당해 주어야 한다.

        //리터럴 : 코드에서 프로그래머가 직접 입력한 값
        int x = 0b1011;  //0B1011 => 1x8 + 0x4 + 1x2 + 1x1 = 11
        //20의 2진수값을 int y 변수에 저장하세요
        int y = 0b10100;  //20
        //8진수 : 0 으로 시작하고 0~7
        int o1 = 013;  // 1x8 + 3x1 = 11
        int o2 = 0206; // 2x64 + 6x1 = 134
        System.out.println(o1 + " " + o2 );

        //16진수  : 0x , 0X 시작하고 0~9 , A(10),B(11),C,D,E,F (a,b,c,d,e,f)(16수로)
        int z = 0xB3;  // 11X16 + 3X1 = 179
        int x1 = 0x2A0F;  //2X16의 세제곱 + 10 X 16의 제곱 + 15X1
        System.out.println(x1);

        byte v1 = -128;
        byte v2 = 127;
        System.out.println(v1 + " " + v2);

        //long 타입은 수치가 큰데이터를 다루는 프로그램에서 사용된다.
        //int 타입의 허용범위 (-2147483648 ~ 2147483647)를 초과시 리터럴 l, L을 붙여서 컴파일러에게 알려줘야한다.
        long l1 = 10;
        long l2 = 20L;
        long l3 = 100000000000000000L;

        //실수 (float(7자리) 32bit , double(15자리) 64bit)
        double d1 = 0.25;
        double d2 = -3.14;

        double d3 = 5e2; // 5.0 x 10의 제곱  = 500.0
        double d4 = 0.12E-2;  // 0.12 X 10의 -2 제곱 = 0.0012

        float f1 = 3.14f;
        float f2 = 3E6F;

        //double 타입은 float  타입보다 약2배 정도 유효 자릿수를 가지기 때문에 정확한 데이터 저장이 가능하다.
        //논리타입  : 참과 거짓을 의미한다. 리터럴은 true, false 두가지의 상태값을 저장할 필요가 있을때 사용
        //조건문과 제어문의 실행 흐름을 변경하는데 사용  , 연산식에서 비교 및 논리 연산의 산출값을 검증할때 사용
        boolean stop = true;
        stop = false;
        System.out.println(stop);
         int x5 = 30;
        //변수 x5의 값이 20인가?
        boolean result = (x5 == 20);
        System.out.println(result);
        //변수 x5의 값이 20이 아닌가?
        result = (x5 != 20);
        System.out.println(result);
        //변수 x5의 값이 20보다 큰가?
        result = (x5 > 20);
        System.out.println(result);
        //변수 x5의 값이 0보다  크고 20보다 작은가?
        result = (0 < x5  && x5 < 20);
        System.out.println(result);
        //변수 x5의 값이 0보다 작거나 200보다 큰가?
        result = (x5 > 0 || x> 200);
        System.out.println(result);



    }
}
