package day4.section8;

public class BitLogicExample {
	public static void main(String[] args) {
		System.out.println("45 & 25 = " + (45 & 25));
		System.out.println("45 | 25 = " + (45 | 25));
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		System.out.println("~45 = " + (~45));
		System.out.println("-------------------------------");

		byte receiveData = -120;

		//방법1: 비트 논리곱 연산으로 Unsigned 정수 얻기  카멜표기법을 이용하여 변수나 메소드 정의
		int unsignedInt = receiveData & 255;
		System.out.println(unsignedInt);


		//방법2: 자바 API를 이용해서 Unsigned 정수 얻기
		int unsignedInt2 = Byte.toUnsignedInt(receiveData);
		System.out.println(unsignedInt2);


	}
}