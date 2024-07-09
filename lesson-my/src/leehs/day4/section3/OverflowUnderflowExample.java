package day4.section3;

public class OverflowUnderflowExample {
	public static void main(String[] args) {
		byte var1 = 125;
		for(int i=0; i < 5 ; i++ ){
			var1++;
			System.out.println("var1 = " + var1);
		}

		System.out.println("-----------------------");

		byte var2 = -125;
		for(int i=0; i < 5 ; i++ ){
			var2--;
			System.out.println("var2 = " + var2);
		}

		int xx = 10000000;
		long yy = 10000000;
		long zz = xx * yy;
		System.out.println(zz);

	}
}