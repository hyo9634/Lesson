package day2;

public class BookTest {

    public static void main(String[] args) {
        //Q1. 한 권의 책 데이터를 저장하고 출력하세요. 기준은 Book 변수를 참조하세요.
        //책제목: 자바프로그래밍  가격: 30000 출판사:한빛미디어  저자:김자바 페이지수:1000 isbn: ISBN-111990011
        //해당 책의 정보를 모두 출력하세요
        String title = "자바프로그래밍";
        int price = 30000;
        String company = "한빛미디어";
        String author = "김자바";
        int page = 1000;
        String isbn = "ISBN-111990011";
        System.out.println(title+"\t"+price+"\t"+company+"\t"+author+"\t"+page
        +"\t"+isbn);

    }

}
