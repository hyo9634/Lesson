package day5_6.section4;

import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {

        //키보드로 부터 입력받은 숫자가 짝수인지 홀수인지 판별하고, 계속 입력 진행할지 여부를 선택하기 위한 프로그램 - while
        // 종료조건 : 계속 입력을 받고 싶다면 1 번 선택, 끝내고 싶다면 0 번을 입력받기

        //1. 입력기 생성
        Scanner S = new Scanner(System.in);

        //2. 반복 종료 조건 변수 설정
        int choice = 1;

        /*3. while문 작성 :
         *     1. 종료 조건은 사용자의 선택이 1이라고 하면 계속진행 해야 겠다.
         *     2. 숫자를 입력 해달라고 안내문을 써야지
         *     3. 사용자가 입력한 숫자를 입력기를 이용해서 받아서 저장해야지
         *     4. 입력받은 숫자의 짝홀수 여부를 판단해 봐야지 (% 나머지 연산자를 이용해서 나머지가 0이면 짝수)
         *     5. 판단 내용을 출력하고
         *     6. go, stop 를 선택받자
         *
         * */
        while(choice == 1){
            int number;   //사용자가 입력한 숫자 저장 변수

            System.out.println("숫자를 하나만 제발 입력하세요! ");
            number = S.nextInt();

            if(number % 2 == 0){
                System.out.println("짝수");
            }else if(number  == 0){
                System.out.println("0");
            }
            else if(number % 2 == 1){
                System.out.println("홀수");
            } else {
                System.out.println("판단할 수 있는 숫자가 아닙니다.");
            }

            System.out.println("계속하고 싶다면 숫자 1, 끝내고 싶다면 숫자 0 입력 ");
            choice = S.nextInt();
                  }

        System.out.println("짝 홀 수 처리 프로그램을 종료합니다.");
    }
}