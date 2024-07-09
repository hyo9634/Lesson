package day4.section10;

public class AssignmentOperatorExample {
	public static void main(String[] args) {
		int result = 0;
		result += 10;   // result = result + 10      total+=i

		int totalValue = 0;   //누적된 합
		for(int i=1; i<11;i++){
			totalValue+=i;   //totalValue = totalValue + i;
		}
		System.out.println("1-10 sum totalValue :" + totalValue);



	}
}