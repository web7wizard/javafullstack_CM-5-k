public class Q2
{
  
  public static void main(String args[])
  {
   cal(3.70,"mercury");
   cal(8.87,"venus");
   cal(9.807,"earth");
   cal(3.17,"Mars");
   cal(24.79,"jupiter");
   cal(10.44,"saturn");
   }

  public static void cal(double g,String n)
  {
    int mass=70;
    double gravity=g;
    String name=n;
    double w=mass*gravity/9.8;
 
    System.out.println("weight on "+name+" is  "+w);
 }
} 
    