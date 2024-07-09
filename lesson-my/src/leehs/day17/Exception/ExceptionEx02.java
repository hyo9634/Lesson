package day17.Exception;

public class ExceptionEx02 {

  public static void main(String[] args) {

  String[] array = {"1000", "l00", null, "200"};

//  for (String str : array){
//    System.out.println(str);
//  }

    try {
      for(int i = 0 ; i<4 ; i++){
        int value = Integer.parseInt(array[i]);//"l00"의 l을 처리불가
        System.out.println("array[" + i + "] : " + value);
      }//길이가 4인 배열인데, 4이외의 것을 요구한다. 실행 에러
    } catch (ArrayIndexOutOfBoundsException e) {
      System.err.println(e.getMessage());
    } catch (NullPointerException | NumberFormatException e) {//null과 데이터 값을 함께 (or)로
      e.printStackTrace();

    }
    System.out.println("프로그램 정상 종료");


  }

}
