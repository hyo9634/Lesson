package lhs.StudentManageSystem.Student;

import java.util.ArrayList;

//관리 시스템 기능 조작 할거임
//싱글톤으로 객체 생성
public abstract class StudentManager extends studentDBIO {
  private static final StudentManager instance = new StudentManager() {
  };

  //2. 생성자를 불러낼 수 없게 생성자 막기
  private StudentManager(){}

  //3.
  public static StudentManager getInstance(){
    return instance;
  }
  public boolean insertStudent(Student student){//학생 정보 입력기능(학생 객체 생성(VO) 후 학생 정보 저장)
    return false;

  }



  public ArrayList<Student> getsortedStudent() {//학생 석차 처리 가능
    return new ArrayList<>();


  }
//제너릭 <> : 저장소에 student 객체만 저장하도록 (타입을 제한)
  public ArrayList<Student> getStudentList() {//2번 메뉴 : 학생 전체 보기 가능, 학번으로도 메뉴로도 볼 수 있도록

    return new ArrayList<>();//sno를 받기로 함
  }

  public ArrayList<Student> searchStudent(String sno) { //3번 메뉴 : 학생의 학번으로 검색하여 정보 조회 가능

    return new ArrayList<>();
  }

  //왜 student ABIO을 만드는가? 각각의 메서드들이 공유하여 사용해야함
  //설계도를 볼 때 원칙적으로는 하향식 설계로 만들어야함

}
