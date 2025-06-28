
class Count
{
 
  public static void main(String args[])
  {
     Integer[] arr={10,20,30,40,50,20};
     check(arr,20);
  }
   public static <T> void check(T[] arr,T a1)
  {
     int flag1=0;
    for(int i=0;i<=arr.length-1;i++)
    {
      if(arr[i]==a1)
      {
        flag1++;
      }
    }

  System.out.println("number  "+a1+"  found in array "+flag1 +"  times"); 
 }
}




// output== number  20  found in array 2  times



class LinearS
{
 
  public static void main(String args[])
  {
     Integer[] arr={10,20,30,40,50,70};
     int p=check(arr,10); 
     System.out.println("return number= "+p);
  }
   public static <T>  int check(T[] arr,T a1)
  {
     int ind=0;
     int flag1=0;
    for(int i=0;i<=arr.length-1;i++)
    {
      if(arr[i]==a1)
      {
        flag1++;
        ind=i;
      }
    }
   if(flag1==1)
    {
    System.out.println("number  "+a1+"  found in array "); 
    return ind;
   }
   else
  {
    System.out.println("number  "+a1+" not found in array ");
    return -1; 
  } 
 }
} 



// output== number  10  found in array
//          return number= 0




class MINMAX
{
 
  public static void main(String args[])
  {
     Integer[] arr={10,20,30,40,50,70};
     
     check(arr,arr[0],arr[0]);
  }
   public static <T extends Comparable <T>> void check(T[] arr,T a1,T a2)
  {
   
    for(int i=0;i<=arr.length-1;i++)
    {
      if(a1.compareTo(arr[i]) >0)
      {
        a1=arr[i];
      }
      if( a2.compareTo(arr[i]) <0)
      {
       a2=arr[i];
      }
    }
    
    System.out.println("minimum number in array = "+a1+"  maximum number in array= "+a2); 
 
 }
}





// output == minimum number in array = 10  maximum number in array= 70