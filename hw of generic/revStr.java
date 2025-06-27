public class revstr
{
 public static void main(String args[])
 {
  String str="hello";
  rev(str);
  }

 public static <T> void rev(T arr)
 {
   StringBuffer s=new StringBuffer((String)arr);
   System.out.println("reverse of "+arr+"  is   "+s.reverse());
 }
}

// output ==  reverse of hello  is  olleh