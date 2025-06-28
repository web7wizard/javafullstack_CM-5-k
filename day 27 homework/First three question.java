class CheckSorted
{
 
  public static void main(String args[])
  {
     Integer[] arr={10,20,30,20};
     check(arr);
  }
   public static <T extends Comparable <T>> void check(T[] arr)
  {
     int flag1=0;
     for(int i=0;i<=arr.length-1;i++)
     {
        if(i==arr.length-1)
       {break;}
       if(arr[i].compareTo(arr[i+1])>0)
       {
        flag1++;
       }
       if(flag1==1)
       {  
          System.out.println("array is not sorted -----------");
           break; 
       }
    }
   if(flag1==0)
   {
     System.out.println("array is sorted --------"); 
   }
 }
}

//output == array is sorted --------


class FindMid
{
 
  public static void main(String args[])
  {
     Integer[] arr={10,20,30,40,50};
     check(arr);
  }
   public static <T extends Comparable <T>> void check(T[] arr)
  {
     
     int len=arr.length;
     int mid=len/2;
     System.out.println("middle element=  "+arr[mid]);
 }
}


// output == middle element=  30


class CheckTwoElE
{
 
  public static void main(String args[])
  {
     Integer[] arr={10,20,30,40,50};
     check(arr,10,60);
  }
   public static <T extends Comparable <T>> void check(T[] arr,T a1,T a2)
  {
     int flag1=0,flag2=0;
     for(int i=0;i<=arr.length-1;i++)
     {
        if(arr[i]==a1)
        {
          System.out.println(a1+"  found at "+i+" index of array");
          flag1=1;
        }

       if(arr[i]==a2)
        {
          System.out.println(a1+"  found at "+i+" index of array");
          flag2=1;
        }
       
    } 
    if(flag1==0)
    {  System.out.println(a1+" not found in array "); }
    
    if(flag2==0)
    {  System.out.println(a2+" not found in array "); }

 }
}


//output == 10  found at 0 index of array
//          60 not found in array