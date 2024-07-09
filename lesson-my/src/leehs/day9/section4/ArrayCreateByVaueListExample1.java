package day9.section4;

public class ArrayCreateByVaueListExample1 {

  public static void main(String[] args) {
    //배열 변수 선언과 배열 생성
    String[] season = new String[]{"Spring", "Summer", "Fall", "Winter"};
    //String[] season = {"Spring", "Summer", "Fall", "Winter"};

    //배열의 항목값 읽기
    System.out.println(season[0]);
    System.out.println(season[1]);
    System.out.println(season[2]);
    System.out.println(season[3]);
    for (String s : season) {
      System.out.println(s);
    }

    //인덱스 1 항목의 값 변경
    season[1] = "여름";
    System.out.println(season[1]);

    //정수형 배열 scores 변수 선언하고 배열 생성 {90, 80, 75, 93, 100}
    int score[] = {90, 80, 75, 93, 100};
    int sum = 0;
    double avg = 0;

    //총합과 평균 구하기
    for (int i : score) {
      sum += i;
    }

    avg = (double) sum / score.length;
    System.out.println("sum : " + sum);
    System.out.printf("avg : %.1f", avg);

  }
}

