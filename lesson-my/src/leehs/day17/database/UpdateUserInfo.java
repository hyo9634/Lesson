package day17.database;

import day17.database.Dbconf.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateUserInfo {
  static Connection connection = null;

  public static void main(String[] args) {

    connection = ConnectionFactory.getInstance().open();
    String query = new StringBuilder()
        .append("UPDATE usert SET")
        .append("userage + ? , ")
        .append("useremail + ? ")
        .append("WHERE userid = ? ").toString();//WHERE로 미리 입력하는 값이 아니라입력하는 값으로 변경

    /*PreparedStatement pstmt = connection.prepareStatement(query);
    pstmt.setInt(1,8);
    pstmt.setString(2,"dasd@dasdsa.com");
    pstmt.setString(3,"서현우");

    int rows = pstmt.executeUpdate();
    System.out.println("수정된 행의 수 : " + rows);
    try {
      pstmt.close();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
    }*/
  }

}
