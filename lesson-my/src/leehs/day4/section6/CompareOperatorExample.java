package day4.section6;

public class CompareOperatorExample {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;

		if(num1 == num2){
			System.out.println("같다");
		}   //num1 과 num2 의 값을 비교하여 같으면 같다. 다르다. 결과 값을 출력
		else{
			System.out.println("다르다");
		}

		if(num1 != num2){
			System.out.println("다르다");
		}   //num1 과 num2 의 값을 비교하여 같으면 같다. 다르다. 결과 값을 출력
		else{
			System.out.println("같다");
		}

        char ch = 'A';
		int  chInt = 65;
		if(ch == chInt){
			System.out.println("같다");
		}   //num1 과 num2 의 값을 비교하여 같으면 같다. 다르다. 결과 값을 출력
		else{
			System.out.println("틀리다");
		}
		System.out.println(ch == chInt);

		//예외 check!
		//0.1f  == 0.1
		System.out.println(0.1f == 0.1);
		System.out.println(0.1f ==(float)0.1);

		//문자열을 비교시 ,  equals() !equals()
		String str1 = "안녕";
		String str2 = "안 녕";

		boolean result = str1.equals(str2);
		System.out.println(result);

		boolean result1 = ! str1.equals(str2);
		System.out.println(result1);


	}
}