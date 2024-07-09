package day2;
//책(Object) : 제목, 가격, 출판사,저자, 페이지수, isbn....
//class : 새로운 자료형을 설계하는 도구(Modeling)
public class Book {
    public String title;
    public int price;
    public String company;
    public String author;
    public int totalpage;
    public String isbn;

    public void bookInfo(){
        System.out.println("야옹서점 책 정보 입니다.");
        System.out.println(this.title + "\t" + this.author);
    }
    public int bookPrice(){
        return this.price;
    }
    public void setBookPrice(int price){
            this.price =  price;
    }
}
