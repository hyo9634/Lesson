package day4.section1;

public class SignOperatorExample {
	public static void main(String[] args) {

		byte b = 100;
		int result = -b; //정수타입(byte,short,int)연산의 결과는 int 타입

		int x = -100;
		x = -x;
		System.out.println("x: " + x);


		System.out.println("result: " + result);
	}
}