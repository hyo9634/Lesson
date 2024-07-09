package day18;

public class StringBuilderEX {

  public static void main(String[] args) {
    String data = new StringBuilder().append("abc")
        .append("K").insert(0, "ABC").delete(0, 1).toString();
    System.out.println(data);

    //StringBuilder data1 = (StringBuilder) data;
  }

}
