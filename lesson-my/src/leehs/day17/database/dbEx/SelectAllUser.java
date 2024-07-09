package day17.database.dbEx;

import day17.database.dbEx.dbconf.ConnectionFactory;
import day17.database.dbEx.vo.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SelectAllUser {

  static Connection connection = null;
  static ResultSet rs = null;
  static ArrayList<User> userlist = new ArrayList<User>();

  public static void main(String[] args) {
    String query = "SELECT * FROM users";

    connection = ConnectionFactory.getInstance().open();

    try {
      PreparedStatement pstmt = connection.prepareStatement(query);
      rs = pstmt.executeQuery();
      while (rs.next()) {
        User user = new User();
        user.setUserId(rs.getString("userid"));
        user.setUserName(rs.getString("username"));
        user.setUserAage(rs.getInt("userage"));
        user.setUserEmail(rs.getString("useremail"));
        
        userlist.add(user);

      }
      for (User user : userlist) {
        System.out.println(user.getUserId() + " " + user.getUserName());
      }
      rs.close();
      pstmt.close();
    } catch (
        SQLException e) {
      throw new RuntimeException(e);
    } finally {
      ConnectionFactory.getInstance().close();
    }
  }

}


