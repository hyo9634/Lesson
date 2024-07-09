package day5_6.section1;

import java.util.Scanner;

public class ConditionalExam {

    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);

        int value = sc.nextInt();
                ;
        if( value % 3 == 0 ) {
            System.out.println("value는 3의 배수입니다.");
            if(value %10 == 0){
            System.out.println("value는 10의 배수입니다.");}
        }else{
            System.out.println("해당 사항 없음");
        }
    }
}
