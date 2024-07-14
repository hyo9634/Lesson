package lhs.StudentManageSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntegrationSystem_study {

  //	 콘솔 입력 버퍼 생성
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	// Input(입력하다)Stream(시냇물처럼 들어오는 데이터를)Reader(문자형태로) Buffered//라는 가상공간에 Reader에 넣겠다.
	//데이터를 빨리 읽어 문자열로 처리할 때 사용

  public static void main(String[] args) throws IOException {
		IntegrationSystem_study Instance = new IntegrationSystem_study();
		String buffer = null;//메인 안에 넣지않고 전체 해당 클래스에서 사용하겠다.

		while (true) {
			System.out.println("====== [ 메뉴를 선택 하세요 ] ======");
			System.out.println("1. 학생 관리 시스템");
			System.out.println("2. 시스템 종료");
			System.out.println("--------------------------------");

			int nSel = System.in.read() - 48;
			System.in.skip(System.in.available());

			switch (nSel) {

				case 1:
					while (true) {
						System.out.println("======= [ 학생 관리 시스템 ] =======");
						System.out.println("1. 학생 추가");
						System.out.println("2. 학생 전체 보기");
						System.out.println("3. 학생 검색");
						System.out.println("4. 학생 석차순으로 보기");
						System.out.println("5. 이전으로");
						System.out.println("--------------------------------");
						nSel = System.in.read() - 48;
						System.in.skip(System.in.available());
						switch (nSel) {
							case 1:
								Instance.insertStudent();
								continue;
							case 2:
								Instance.getStudentList();
								continue;
							case 3:
								Instance.searchStudent();
								continue;
							case 4:
								Instance.sortedStudent();
								continue;
							case 5:
								break;
							default:
								continue;
						}
						break;
					}
					continue;
				case 3:
					break;
				default:
					continue;
			}
			break;
		}
	}

  // 학생 삽입
  public void insertStudent() {//학생 정보 입력기능(학생 객체 생성(VO) 후 학생 정보 저장)

  }

  public void sortedStudent() {//학생 석차 처리 가능

  }

  public void getStudentList() {//2번 메뉴 : 학생 전체 보기 가능

  }

  public void searchStudent() { //3번 메뉴 : 학생의 학번으로 검색하여 정보 조회 가능

  }


  }
