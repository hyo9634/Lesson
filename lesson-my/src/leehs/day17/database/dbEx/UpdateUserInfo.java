package day17.database.dbEx;

import day17.database.dbEx.dbconf.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateUserInfo {

  static Connection connection = null;

  public static void main(String[] args) {

    connection = ConnectionFactory.getInstance().open();
    String query = new StringBuilder()
        .append("UPDATE users SET ")
        .append("userage = ? , ")
        .append("useremail = ?  ")
        .append(" WHERE userid = ? ").toString();

    try {
      PreparedStatement pstmt = connection.prepareStatement(query);
      pstmt.setInt(1, 20);
      pstmt.setString(2, "winter0715@gmail.com");
      pstmt.setString(3, "winter");

      int rows = pstmt.executeUpdate();
      System.out.println("수정된 행의 수 : " + rows);
      pstmt.close();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      ConnectionFactory.getInstance().close();
    }


  }

}
