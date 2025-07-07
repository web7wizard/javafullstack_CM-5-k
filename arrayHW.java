import java.util.Arrays;
class Myclass
{
  public static void main(String args[])
  {
   System.out.println("------------------------------------------------------------");
   System.out.println("output of first hw Q");
   firstQ();
   System.out.println("------------------------------------------------------------");
   System.out.println("output of second hw Q");
   secondQ();
   System.out.println("------------------------------------------------------------");
   System.out.println("output of third hw Q");
   thirdQ();
   System.out.println("------------------------------------------------------------");
   }
  public static void firstQ()
  {
   int arr[]={10,20,30,40,50};
   System.out.println("Array                                  "+Arrays.toString(arr));
   arr[1]=arr[1]+arr[0];
  
   System.out.println("output after add 0 and 1 index:        "+Arrays.toString(arr));
   arr[2]=arr[1]-arr[0];
   System.out.println("output after difference 0 and 1 index: "+Arrays.toString(arr));
  }
  
  public static void secondQ()
  {
   int SL=0,SS=0;
   int arr[]={25,33,88,90,55,17};
   int min,max;
   min=max=arr[0]; 
      for(int i=0;i<arr.length;i++)
      {
        if(arr[i]>max)
         {
           SL=max;
           max=arr[i];
         }
     
        if(arr[i]<min)
        {
           SS=min;
           min=arr[i];
        }
     }
  
  System.out.println("in array "+Arrays.toString(arr)+"  the second largest num is  "+SL);
  System.out.println("in array "+Arrays.toString(arr)+"  the second largest num is  "+SS);
  }
   public static void thirdQ()
  {
      int arr[]={1,2,3,5,6,7,8,9,10};   
      int miss=0;
      int n=1; 
      for(int i=0;i<10;i++)
      {
        if(arr[i]!=n)
        {  miss=n;
           break;
        }
        n++;
     }
     
     System.out.println("Array                                  "+Arrays.toString(arr));
     System.out.println("missing number in array list           "+miss);   
  }

}


-----------------------------------------------------------

output 

------------------------------------------------------------
output of first hw Q
Array                                  [10, 20, 30, 40, 50]
output after add 0 and 1 index:        [10, 30, 30, 40, 50]
output after difference 0 and 1 index: [10, 30, 20, 40, 50]
------------------------------------------------------------
output of second hw Q
in array [25, 33, 88, 90, 55, 17]  the second largest num is  88
in array [25, 33, 88, 90, 55, 17]  the second largest num is  25
------------------------------------------------------------
output of third hw Q
Array                                  [1, 2, 3, 5, 6, 7, 8, 9, 10]
missing number in array list           4
------------------------------------------------------------