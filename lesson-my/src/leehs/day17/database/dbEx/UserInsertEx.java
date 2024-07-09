package day17.database.dbEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertEx {

  public static void main(String[] args) {
    Connection connection = null;
    String url = "jdbc:mysql://127.0.0.1:3306/ssgdatabase";

    String id = "root";
    String pwd = "1234";

    String query = "INSERT INTO users(userid,username,userage,useremail) " + "VALUES (?,?,?,?)";

    try {
      connection = DriverManager.getConnection(url, id, pwd);

      //PreparedStatement 객체 생성하여 쿼리문 넣기
      PreparedStatement pstmt = connection.prepareStatement(query);

      //PrepatedStatement 객체 파라메터(?)에 순서와 타입 확인하여 데이터 할당하기
      pstmt.setString(1, "winter");
      pstmt.setString(2, "서유미");
      pstmt.setInt(3, 10);
      pstmt.setString(4, "winter0712@gmail.com");

      //SQL문 실행
      int rows = pstmt.executeUpdate();
      System.out.println("저장된 행의 수 :" + rows);
      pstmt.close();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      if (connection != null) {
        try {
          //서버와 연결 끊기
          connection.close();
          System.out.println("bye!");
        } catch (SQLException e) {
          throw new RuntimeException(e);
        }

      }
    }

  }

}
