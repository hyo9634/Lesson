package day7.section1;

import java.util.Scanner;

public class MethodEx1 {

  static Scanner sc = new Scanner(System.in);

  static void getPlayerInfo(int group, int n) {
    String diceGroupName = new String("");

    System.out.println("그룹 : " + group + " " + "각 그룹의 인원수 :" + n);
  }


  // 주사위 게임을 몇개의 그룹에서 몇명이 참여하여 차례로 한번씩 주사위를 던질 수 있도록 제공하는 프로그램
  public static void main(String[] args) {
    MethodEx1 mex1 = new MethodEx1();
    int group = 0;
    int n = 0;
    for (int i = 0; i < 3; i++) {
      group = mex1.SettingGroup();
      n = mex1.playerSetting();

      mex1.dicePlay(group, n);

    }
    getPlayerInfo(group, n);
  }

  int SettingGroup() {
    System.out.print("몇 개의 그룹으로 진행할까요?");
    int group = sc.nextInt();
    return group;
  }

  int playerSetting() {
    System.out.print("참여자의 인원수를 입력해 주세요");
    int n = sc.nextInt();
    return n;
  }


  void dicePlay(int group, int n) {
    for (int j = 1; j <= group; j++) {
      System.out.printf("%d 의 플레이가 시작됩니다.", j);
      for (int i = 1; i <= n; i++) {

        int num = (int) (Math.random() * 6) + 1;

        if (num == 1) {
          System.out.println("1번이 나왔습니다.");
        } else if (num == 2) {
          System.out.println("2번이 나왔습니다.");
        } else if (num == 3) {
          System.out.println("3번이 나왔습니다.");
        } else if (num == 4) {
          System.out.println("4번이 나왔습니다.");
        } else if (num == 5) {
          System.out.println("5번이 나왔습니다.");
        } else {
          System.out.println("6번이 나왔습니다.");
        }
      }

    }
  }


}
