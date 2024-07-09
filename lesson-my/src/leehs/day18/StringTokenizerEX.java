package day18;

import java.util.StringTokenizer;

public class StringTokenizerEX {

  public static void main(String[] args) {
    //String 자르기

    String data1 = "김창완&정수민&김지훈";
    //1. &토큰라이저 하여 학생이름을 1김창완 2정수민 3김지훈으로 출력하세요
    StringTokenizer st = new StringTokenizer(data1, "&");
    int no = 0;
    while(st.hasMoreTokens()){
      String token =  st.nextToken();
      no++;
      System.out.println(no + " " + token);
    }


    // 2. 결과 동일하게 split()을 이용하여 출력하세요.
  //배열로 리턴
  String[] list = data1.split("&");
    int num = 0;
    for (String str : list) {
      num++;
      System.out.println(num + " " + str);
    }
}
}
