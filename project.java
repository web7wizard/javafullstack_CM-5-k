import java.util.Scanner;
import java.sql.*;
class project 
{
  public static void main(String args[]) throws Exception
  {
    int ch=0;
    Scanner sc=new Scanner(System.in);
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
    String q="create table loginT(name varchar(40),passw varchar(40))";
    PreparedStatement ps=conn.prepareStatement(q);
    ps.executeUpdate();
    
     q="create table book(name varchar(40),author varchar(40),price int)";
    PreparedStatement pss=conn.prepareStatement(q);
    pss.executeUpdate();
    
    while(ch==3)
    {
      System.out.println(" 1: login   2:create new user  3: exit ");
      ch=sc.nextInt();
      switch(ch)
      {
        case 1:
               login(); break;
        case 2:
               int i=newU();
               if(i==1)
               { shop(); }
               break;
        case 3:
               System.out.println("please come again for shopping------- have a nice day");
      }
    }       
       
  }
  
  public static void login()
  {
     String user,pass;
     System.out.println("enter the user name");
     Scanner sc=new Scanner(System.in);
     user=sc.next();
     System.out.println("enter the passward");
     pass=sc.next();

    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
    String q="insert into loginT values(?,?)";
    PreparedStatement ps=conn.prepareStatement(q);
    ps.setString(1,user);
    ps.setString(2,pass);
    ps.executeUpdate();
    ps.close();
    conn.close();
    shop();
     
  }
  
  public static int newU()
  {
    int flag=0;
    String user,pass;
     System.out.println("enter the user name");
     Scanner sc=new Scanner(System.in);
     user=sc.next();
     System.out.println("enter the passward");
     pass=sc.next();

    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
    Statement s=conn.createStatement();
    ResultSet res=s.executeQuery("select * from login");
    while(res.next())
    {
     if(res.getString(1)==user && res.getString(2)==pass)
     {System.out.println("login successfull, welcome back to shopping ................"); return 1; }
    }
    if(flag==0)
    {System.out.println("login unsuccessfull,try again next time -------------"); return 2; }
     res.close();
     s.close();
    conn.close();
   }

  public static void shop()
  {
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
    Statement s=conn.createStatement();
    ResultSet res=s.executeQuery("select * from book");
    while(res.next())
    {
     System.out.println("book name =\t"+res.getString(1)+"  author=\t"+res.getString(2)+"  price=\t"+res.getInt(3));
    }
    Scanner sc=new Scanner(System.in);
    int ch=0;
    while(ch==2)
    {
      System.out.println(" 1: buy a book from above  2: i dont wanna buy this time maybe next time");
      ch=sc.nextInt();
      switch(ch)
      {
        case 1:
              System.out.println("enter the book name");
              String n=sc.next();
               ResultSet ress=s.executeQuery("select * from book");
             while(ress.next())
             {
               if(ress.getString(1)==n)
               {System.out.println("order is placed thanks---------------");}
               else
               {System.out.println("book not available---------------"); }
            }
            break;
        case 2:
               System.out.println("please come again for shopping------- have a nice day"); break;
      }
    }       
     res.close();
     s.close();
    conn.close();    
  }

 }
