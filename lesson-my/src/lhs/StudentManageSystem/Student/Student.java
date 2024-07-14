package lhs.StudentManageSystem.Student;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Student {
  private String sno;
  private String name;
  private int[] record = new int[4];//각 성적 점수를 저장할 record 만들기(국어 영어 수학...)
  private int total;
  private double average;
  private String grade;
  private int rank = -1;
  static enum GRADE {A,B,C,D,F};

  //여기서부터 리팩토링
  //생성자 오버로딩
  public Student(){}
  public Student(String sno, String name, int korea, int english, int math, int sci){
    //인스턴스 멤버 초기화
    this.sno =  sno;
    this.name = name;
    this.record[0] = korea;
    this.record[1] = english;
    this.record[2] = math;
    this.record[3] = sci;//for를 이용하여 최기화 진행 리팩토링해보기

    this.makeScores();
  }
  public Student(String sno, String name, int korea, int english, int math, int sci, int total, double average, String grade){}

  public String getSno() {
    return sno;
  }

  public String getName() {
    return name;
  }

  public int[] getRecord() {
    return record;
  }

  public int getTotal() {
    return total;
  }

  public double getAverage() {
    return average;
  }

  public String getGrade() {
    return grade;
  }

  public int getRank() {
    return rank;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }

  private void makeScores() {
    for (int score : record) {
      this.total += score;
    }
    //평균작업
    this.average = (double) this.total / record.length;
  }


    //grade도 작업
    private void makeGrade(){
      if (getAverage() > 90 && getAverage() <= 100) {
        this.grade = String.valueOf(GRADE.A);
      } else if (getAverage() > 80 && getAverage() <= 90) {
        this.grade = String.valueOf(GRADE.B);
      } else if (getAverage() > 70 && getAverage() <= 80) {
        this.grade = String.valueOf(GRADE.C);
      } else if (getAverage() > 60 && getAverage() <= 70) {
        this.grade = String.valueOf(GRADE.D);
      } else {
        this.grade = String.valueOf(GRADE.F);
      }
    }
      //enum grade 를 기준으로 학점 매기기



      }












