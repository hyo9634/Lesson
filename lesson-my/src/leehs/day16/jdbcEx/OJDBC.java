package day16.jdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OJDBC {

  private Connection con;
  private Statement stmt;
  private ResultSet rs;

  public OJDBC() {
    try {
      String OracleUrl = "jdbc:mysql://localhost:3306/employees?characterEncoding=UTF-8&serverTimezone=UTC";
      String OracleUser = "root";
      String OraclePasswd = "1234";

      con = DriverManager.getConnection(OracleUrl, OracleUser, OraclePasswd);
      System.out.println("DB연결 성공");

      stmt = con.createStatement();
      System.out.println("Statement객체 생성 성공");

      rs = stmt.executeQuery("select * from member"); //조회한 결과들을 ResultSet에 rs에 저장한다.

      rs.close();
      stmt.close();
      con.close();

    } catch (SQLException e) {
      System.out.println("DB연결 실패하거나, SQL문이 틀렸습니다.");
      System.out.print("사유 : " + e.getMessage());
    }
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    new OJDBC();
  }

}