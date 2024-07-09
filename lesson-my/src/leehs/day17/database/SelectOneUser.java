package day17.database;

import day17.database.Dbconf.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SelectOneUser {

static Connection connection = null;

  public static void main(String[] args) { //커넥션 받아오기 (Factory에서)-쿼리문 작업
    String query = "SELECT userid, username, userage, useremail" + "FROM users" + "WHERE userid = ?";
    //String query = "SELECT * FROM users"; users값을 모두 가져와라

    connection = ConnectionFactory.getInstance().open();

    PreparedStatement pstmt = null;
    try {//연결 간의 발생한 에러를 잡기 위해서 try catch문을 사용 (원인을 알기 위해서)
      pstmt = connection.prepareStatement(query);

    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
    //pstmt.

  }

}
