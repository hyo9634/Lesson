package day5_6.section2;

public class SwitchNoBreakCaseExample {
	public static void main(String[] args) {
          int time = (int) (Math.random()*4)+8;
		// Math.random() 함수를 이용해서 8시부터 11사이의 정수값을 발생시켜  int time 변수에 할당 한 후

		// 8 이면 출근합니다.
		switch(time){

			case 8 :
				System.out.println(time + "시" + "출근");
				break;
			case 9 :
				System.out.println(time + "시" + "회의"); break;
			case 10 :
				System.out.println(time + "시" + "업무"); break;
			default:
				System.out.println(time + "시" + "출장"); break;



		}
		// 9 이면 회의를 합니다.
		//10 이면 업무를 합니다.
		//11 이면 출장을 나갑니다. switch문 작성



		}
	}
