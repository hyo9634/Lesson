package day9.section1;

public class StringSplitTokenizerEx {

  //String 클래스 : 문자열을 추출 split()
  public static void main(String[] args) {
    //public String[] split(String regex, int limit);
    //반환을 String 배열로 받는다.
    //구분 기호를 문자열이 아닌 정규표현식으로 받는다.

    String str1 = "mycaptain0771@gmail.com";
    String[] splitch = str1.split("@");
    int index = 1;
    for (String s : splitch) {   //enhanced for (향상된 for)
      System.out.println(index + " " + s);
      index++;
    }
    System.out.println("=============================");
    for (int i = 0; i < splitch.length; i++) {

      System.out.printf("%d : %s \n", i + 1, splitch[i]);

    }
    System.out.println("=======================================");
    String str2 = "mycaptain0771@gmail.com@http://github.com/thatzcool@notion.so/thatzcool";

    String[] splitch1 = str2.split("@", 4);

    index = 1;
    for (String s : splitch1) {   //enhanced for (향상된 for)
      System.out.println(index + " " + s);
      index++;
    }
    System.out.println("=============================");
    String str3 = "ssg-in&c%https://github.com";
    String[] result1 = str3.split("[-&%]");
    index = 1;
    for (String s : result1) {   //enhanced for (향상된 for)
      System.out.println(index + " " + s);
      index++;
    }
    System.out.println("=========================");
    String str4 = "ssg in c https://github.com";
    String[] result2 = str4.split(" ");
    index = 1;
    for (String s : result2) {   //enhanced for (향상된 for)
      System.out.println(index + " " + s);
      index++;
    }

    System.out.println("=========================");
    String str5 = "ssg|in|c|https://github.com";
    String[] result3 = str5.split("\\|");
    index = 1;
    for (String s : result3) {   //enhanced for (향상된 for)
      System.out.println(index + " " + s);
      index++;
    }
    System.out.println("==============================================");
    //java.util.SpringTokenizer 클래스와 String.split() 차이점을 정리해서 마무리

  }
}
