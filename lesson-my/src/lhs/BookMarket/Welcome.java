package lhs.BookMarket;//출력값이 콘솔창에 출력되는 방식 : CLI(commend Line Interface) 방식
//GUI() : 사용자를 위해 (사용자의 클릭만으로) 조작하는 화면을 제공하는 방식 > CLI
import java.lang.*;
import java.util.Scanner;

public class Welcome {

    public static void main(String[] args) {
        //변수에 저장을 하면 매번 새로운 값으로 리셋할 수 있는 권한 설정이 됨
        String greeting = "Welcome to Shopping Mall";
        String tagLine = "Welcome to BookMarket";
        //숫자 + 문자 연산 =  덧셈연산이 아니라 연결 연산이 됨

        String name = "";
        String phoneNumber = "";
        Scanner sc = new Scanner (System.in);//새로운 객체 만들기 (입력)
        System.out.print("당신의 이름을 입력해주세요 : ");
        name = sc.nextLine();
        System.out.print("당신의 연락처를 입력해주세요 : ");
        phoneNumber = sc.nextLine();//엔터를 칠 때 까지 값을 받아와야함 그 값을 name에 넣어야함

        //while은 무한 반복이기 때문에 종료 조건 필수
        boolean quit = true;
        while (quit) {
            System.out.println("****************************************************");
            System.out.println("\t" + greeting);
            System.out.println("\t" + tagLine);
            menuInstruction();//호출해달라고 요청하기

            System.out.print("메뉴 번호를 선택해주세요 : ");
            int num = sc.nextInt();
            System.out.println(num + "번을 선택했습니다.");

            //1~8 이외의 값을 막기 위해
            if (num < 1 || num > 8) {
                System.out.println("메뉴는 1부터 8까지의 숫자로 입력해 주세요!");
            } else {

                switch (num) {//점프, 호출 컨트롤러
                    case 1: //고객정보입력 매소드
                        menuGuestInfo(name, phoneNumber);//->method로 처리함, 처음에 입력한 고객정보를 가져옴
                        break;
                    case 2:
                        System.out.println("장바구니 상품 목록 보기");
                        break;
                    case 3:
                        System.out.println("장바구니 비우기");
                        break;
                    case 4:
                        System.out.println("장바구니 항목 추가 하기");
                        break;
                    case 5:
                        System.out.println("장바구니 항목 수량 추가 하기");
                        break;
                    case 6:
                        System.out.println("장바구니 항목 삭제하기");
                        break;
                    case 7:
                        System.out.println("영수증 표시하기");
                        break;
                    case 8:
                        System.out.println("종료");
                        quit = false;
                        System.out.println("도서몰을 찾아주셔서 감사합니다. 다음에 다시 뵙겠습니다.");//8번을 선택할 때까지 반복
                        break;
                    //매번 재시작해야하기 때문에 번거로움, 루프시키기
                }
            }
        }//while 종료시점
    }

    private static void menuGuestInfo(String name, String phoneNumber) {
        System.out.println("현재 고객의 정보 : " + name + " 연락처 :" + phoneNumber);
    }

    public static void menuInstruction() {

    }
}
