package day5_6.section2;

public class SwitchExpressionsExample {
	public static void main(String[] args) {
       char grade = 'A';
	   
	   switch (grade){
		   case 'A','a' ->{
			   System.out.println("우수회원");
		   }
		   case 'B','b' ->{
			   System.out.println("일반회원");
		   }
		   default -> {
			   System.out.println("손님");
		   }
		   
	   }
	   //자바 12 부터 표현식 지원(Expression)

	   switch (grade){
		   case 'A','a' -> System.out.println("우수회원");
		   case 'B','b' -> System.out.println("일반회원");
		   default -> System.out.println("손님");
		   
	   }
	   
	   
	   
	}
}