package day9.section9;

import java.util.Calendar;

public class WeekExample {

  public static void main(String[] args) {
    // Week 열거 타입 변수 선언
    Week today = null;
    // Calendar 얻기
    Calendar calendar = Calendar.getInstance();
//    오늘의 요일 얻기(1~7)
    int week = calendar.get(Calendar.DAY_OF_WEEK);
//    숫자를 열거 상수로 변환해서 변수에 대입
    switch (week) {
      case 1:
        today = Week.SUNDAY;
        break;
      case 2:
        today = Week.MONDAY;
        break;
      case 3:
        today = Week.TUESDAY;
        break;
      case 4:
        today = Week.WEDNESDAY;
        break;
      case 5:
        today = Week.THURSDAY;
        break;
      case 6:
        today = Week.FRIDAY;
        break;
      case 7:
        today = Week.SATURDAY;
        break;
    }

    if (today == Week.SUNDAY) {
      System.out.println("영화보기");
    } else if (today == Week.SATURDAY) {
      System.out.println("펍 가기");
    }

  }
}
