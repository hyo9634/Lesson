package day17.Exception;

public class MyResource implements AutoCloseable{

  private String name;

  //생성자 생성
  public MyResource(String name) {
    this.name = name;
    System.out.println("MyResource (" + this.name + ") 열기");
  }

  public String readOne(){
    System.out.println("MyResource (" + this.name + ") 읽어들이기");
    return "100";
  }
  public String readTwo(){
    System.out.println("MyResource (" + this.name + ") 읽어들이기");
    return "readTwo";
  }

  @Override
  public void close() throws Exception {
    //예외를 던져버림 throws, throw는 내가 새로운 객체를 만들어 예외를 직접 코드에서 발생시킴(특정 상황에서 예외를 던집니다.)
    System.out.println("MyResource (" + this.name + ") 닫기");

  }
}
