package day17.database;

import java.sql.Connection;
import java.sql.*;//드라이버 등록

public class conectionEX {
  private static Connection connection = null;
  private static String url = "jdbc:mysql://127 .0.0.1:3306/ssgdatabase";//<-포트번호
  private static String id = "root";
  private static String pwd = "lhs1379";

  public static void main(String[] args) {
    try {
      //1.forname찾을 수 없어서 넣어주기 -> JDBC드라이버 등록

      Class.forName("com.mysql.cj.jdbc.Driver");

      //연결하기
      connection =DriverManager.getConnection(url,id,pwd);
      System.out.println("connection 객체값=" + connection);// connection이 잘 연결되었는지 확인하기
    } catch (ClassNotFoundException e) {
      System.err.println(e.getMessage());
    } catch (SQLException e) {
      System.err.println(e.getMessage());
    } finally {//안전하고 확실하게 연결을 끊어주는 것이 중요함, close를 확실하게 해주기
      if(connection != null){
        try {//안내문을 보낸 다음 끝내야함, 그래야 신뢰성있는 통신이 가능함-Exception만들어주기 (독립적으로 실행 될 수 없음)
          connection.close();
          System.out.println("서버와의 연결이 끊어졌습니다.");
        } catch (SQLException e) {
          System.err.println(e.getMessage());
        }
      }

    }

  }
  }


