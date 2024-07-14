package lhs.StudentManageSystem.Lib;
//1.학생 시스템뿐만 아니라 시스템을 붙이면서 쓸 것이다.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class ObjectDBIO {

  //1. 커넥션
  private Connection connection = null;
  //connection을 위한 pw id trll필요
  private String db_url = "jdbc:mysql://localhost:3306/employees";
  private String db_id = "root";
  private String db_pwd = "lhs1379";
  String url = "jdbc:mysql://localhost:3306/employees";
  String userName = "root";
  String password = "lhs1379";

  //setter작업


  public void setDb_url(String db_url) {
    this.db_url = db_url;
  }

  public void setDb_id(String db_id) {
    this.db_id = db_id;
  }

  public void setDb_pwd(String db_pwd) {
    this.db_pwd = db_pwd;
  }

  //DB Connection
  private boolean open() {
    try {
      //서버에 드라이버메니저를 통해 커넥션 요청 (파라미터값)
      Class.forName("com.mysql.cj.jdbc.Driver");
      connection = DriverManager.getConnection(db_url, db_id, db_pwd);
    return true;
    } catch (ClassNotFoundException e) {
      System.err.println(e.getMessage());
      return false;
    } catch (SQLException e) {
      System.err.println(e.getMessage());
      return false;
    }
  }



  //DB Disconnection
  protected boolean close() {
    try{
      connection.close();
      return true;
    }catch (SQLException e){
      System.err.println(e.getMessage());
      return false;
    }


  }

  //query 실행시 search select 쿼리문//공통적 부분을 겹치지 않게
  protected ResultSet execute(String query, ResultSet rs) {
    try {
      open();
      Statement obj = connection.createStatement();
      rs = obj.executeQuery(query);
      close();
    } catch (SQLException e) {
      System.err.println(e.getMessage());
    }
    return rs;
  }

  //query 실행시 insert, delete, update  select 쿼리문
  protected boolean execute(String query) {
    boolean result1 = false;
    try {
      open();
      Statement obj = connection.createStatement();

      int result = obj.executeUpdate(query);
      if (result == 1) {
        result1 = true;
      } else {
        result1 = false;
      }
      close();
    } catch (SQLException e) {
      System.err.println(e.getMessage());
      return result1;
    }
    return result1;
  }
}
