import java.sql.*;
public class Del
{
  public static void main(String a[]) throws Exception
  {
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
    String q="delete from std where roll=?";
    PreparedStatement ps=conn.prepareStatement(q);
    
    ps.setInt(1,2501);
    ps.executeUpdate();
    ps.close();
    conn.close();
  }
}
