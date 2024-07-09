package day12.classtest.Inheritance.extendEx;

public class CatMain {

  public static void main(String[] args) {
    BabyCat babycat = new BabyCat();
    System.out.println(babycat.color);
    System.out.println(babycat.breed);
    babycat.meow();
    babycat.eat();

  }


}
