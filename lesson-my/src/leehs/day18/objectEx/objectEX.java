package day18.objectEx;
//매번 번거롭게 객체 내용(?)들을 복사할 수 없기 때문에 새로운 객체를 만들때 가장 상위 클래스인 object클래스에서 clone해옴.

class Myobject implements Cloneable {
  private String name;
  private int age;

  @Override
  protected Object clone() throws CloneNotSupportedException {//리턴값 object, 반드시 예외를 사용해야 가능하다
    // protected 부모 클래스 사용가능
    // super 클래스 사용해서 새로운 객체를 clone함.
    try{
      return (Myobject) super.clone();
    } catch (CloneNotSupportedException e) {
      return null;
    }
  }
}

public class objectEX {

  public static void main(String[] args) throws CloneNotSupportedException {
    Myobject myobject =  new Myobject();
    System.out.println(myobject); // myobject객체의 자신의 정보를 문자열로 반환
    Object copyobject = myobject.clone();//clone은 깊은 복사를 해주는 메서드라고
    Object copyobject2 = myobject;//얕은 복사
    System.out.println(myobject);
    System.out.println(copyobject);
    System.out.println(copyobject2);
  }
}


