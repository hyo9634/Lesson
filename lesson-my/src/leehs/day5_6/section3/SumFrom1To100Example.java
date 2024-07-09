package day5_6.section3;

import java.util.Scanner;

public class SumFrom1To100Example {
	public static void main(String[] args) {
      //키보드로 부터 입력받은 5개의 숫자의 합을 출력하는 프로그램을 작성하세요. 반복문 for 이용
		int total = 0;
		System.out.println("5개의 숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);

		/*int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int n5 = sc.nextInt();
		total = n1 + n2 + n3 + n4 + n5;*/
		//자동화
		for(int i = 1; i <=5 ; i++){
			int number = sc.nextInt();
			total += number;   //total = total + number
		}
		System.out.println("total : " + total);

		int a = 1;
		int sum = 0;
		while(a<=5){
			int number = sc.nextInt();
			sum += number;
			a++;
		}

	}
 }