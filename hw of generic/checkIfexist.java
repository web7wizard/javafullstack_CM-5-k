class checkIfexist
{
 
  public static void main(String args[])
  {
     Integer[] arr={10,20,30,40,50};
     check(arr,20,70);
  }
   public static <T> void check(T[] arr,T a1,T a2)
  {
     int flag1=0,flag2=0;
    for(int i=0;i<=arr.length-1;i++)
    {
      if(arr[i]==a1)
      {
        flag1=1;
      }
     if(arr[i]==a2)
     {
      flag2=1;
      }
    }

   if(flag1==1)
   { System.out.println("number  "+a1+"  found in array"); }

  if(flag2==1)
   { System.out.println("number  "+a2+"  found in array"); }

  }
}