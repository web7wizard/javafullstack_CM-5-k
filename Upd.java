import java.sql.*;
public class Upd
{
  public static void main(String a[]) throws Exception
  {
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
    String q="update std set name=? where roll=?";
    PreparedStatement ps=conn.prepareStatement(q);
    ps.setString(1,"JK");
    ps.setInt(2,2501);
    ps.executeUpdate();
    ps.close();
    conn.close();
  }
}
