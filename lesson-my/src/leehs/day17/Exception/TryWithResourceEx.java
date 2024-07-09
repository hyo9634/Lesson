package day17.Exception;

public class TryWithResourceEx {

  public static void main(String[] args) {

    try(MyResource re =new MyResource("HOPE!")){
    String data =  re.readOne();
      int value = Integer.parseInt(data);

    } catch (Exception e) {
      System.out.println("숫자로 바꿀 수 없습니다.");
      e.getMessage();
    }
    System.out.println();
  }

}
