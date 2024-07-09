package day17.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsert {

  public static void main(String[] args) {
    //connection 작업해주기
    Connection connection = null;
    String url = "jdbc:mysql://127 .0.0.1:3306/ssgdatabase";
    String id = "roo";
    String pwd = "lhs1379";

    String query = "INSERT INTO (userid,username,userage, useremail)" + "VALUES (?, ?, ?, ?)";
    //not null은 무조건 받아야하는데 꼭 받고 싶은 것만 받고 싶을 때, 순서 지켜서 쓰기

    //드라이버 forname은 생략가능

    try {
      connection = DriverManager.getConnection(url, id, pwd);//불안한 메소드 , 예외처리를 안해주면 어떡하지?-> 예외처리해주기

      //String query의 파라미터 순서와 형식 맞추어PreparedStatement 객체 작성(데이터 할당)
      PreparedStatement pstmt = connection.prepareStatement(query);
      pstmt.setString(1,"spring");
      pstmt.setString(2,"이효승");
      pstmt.setInt(3,7);
      pstmt.setString(4,"slgytmd5468@naver.com");

      //sql문 실행
      int rows = pstmt.executeUpdate();
      System.out.println("저장된 행의 수 : " + rows);
      pstmt.close();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      if(connection != null){
        try {
          connection.close();
          System.out.println("서버와의 연결이 끊겼습니다.");
        } catch (SQLException e) {
          System.err.println(e.getMessage());
        }
      }
    }

  }

}
