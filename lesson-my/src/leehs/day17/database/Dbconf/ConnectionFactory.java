package day17.database.Dbconf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
//ConnectionFactory에 Mysql server로 부터 CONNECTION을 얻어오는 open()메소드를 작성하세요
//조건 : 싱글톤 패턴을 적용하여 만들어 주세요.
//커넥션을 매번 만들지 않고 필요할 때 마다 쓰겠다는

  private static Connection connection = null;
  private static String url = "jdbc:mysql://127 .0.0.1:3306/ssgdatabase";//<-포트번호
  private static String id = "root";
  private static String pwd = "lhs1379";

  //외부에서 접근 못하게

  private static final ConnectionFactory instance = new ConnectionFactory();//한 번 생성하면 바꿀 수 없다.final

  private ConnectionFactory(){}

  //외부에서 사용할 수 있을 경우만 사용하도록

  public static ConnectionFactory getInstance(){
    return instance;

  }
  public Connection open(){//connection을 리턴하는 open생성
    try {
      Connection Connection = DriverManager.getConnection(url, id, pwd);
    } catch (SQLException e) {//예외는 e에 떠넘김
      System.err.println(e.getMessage());
    }
return connection;
  }

  public void close(){

  }
}
