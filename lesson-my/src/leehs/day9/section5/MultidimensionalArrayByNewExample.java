package day9.section5;

import java.util.Scanner;

public class MultidimensionalArrayByNewExample {

  public static void main(String[] args) {
    // 각 반의 학생 수가 3명으로 동일할 경우 점수 저장을 위한 2차원 배열 생성
    int[][] engScores = new int[2][3];
    // 배열 항목 초기값 출력 (for 이용)
    for (int i = 0; i < engScores.length; i++) {
      for (int j = 0; j < engScores[i].length; j++) {
        System.out.println("engscores[" + i + "]" + "[" + j + "] => " + engScores[i][j]);
      }

    }
    System.out.println();
    Scanner sc = new Scanner(System.in);

    // engScores 배열에 점수를 입력 받아 항목 값을 변경한 후 변경값 출력하세요
    int total = 0;
    double avg = 0.0;
    int studnetNum = 0;
    System.out.println("영어 과목 점수 입력 프로그램");
    for (int i = 0; i < engScores.length; i++) {   // 반의 수만큼 반복
      studnetNum += engScores[i].length;   //반의 학생 수 합산
      for (int j = 0; j < engScores[i].length; j++) {   //반의 학생수만큼 반복
        System.out.println("한 학생의 영어점수 입력: ");
        int eng = sc.nextInt();
        engScores[i][j] = eng;
        total += engScores[i][j];   //학생 점수 합산
        System.out.println("engscores[" + i + "]" + "[" + j + "] => " + engScores[i][j]);
      }

    }
    // 전체 학생의 영어과목 총점과 평균 구하기
    avg = (double) total / studnetNum;
    System.out.println("전체 학생의 영어 평균 점수 => " + avg);

    // 각 반의 학생 수가 다를 경우 수학점수 저장을 위한 2차원 배열 생성 조건: 전체반은 3반이다. 1반,2반,3반
    int[][] mathScores = new int[3][];

    int stuNum = 0;  //각 반의 학생수를 정한다.

    //1반은 학생수 5명, 2반은 3명, 3반은 10명 이다. 각 반의 학생수를 입력받아 조건에 맞도록 셋팅해서 초기값을 출력하세요
    mathScores[0] = new int[5];
    mathScores[1] = new int[3];
    mathScores[2] = new int[10];

    System.out.println();
    // 배열 항목 값 변경

    // 전체 학생의 영어 평균 구하기

  }
}
