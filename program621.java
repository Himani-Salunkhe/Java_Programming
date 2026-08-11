import java.util.Scanner;

class program621
{
    public static void main(String A[]) 
    {
       Scanner sobj = new Scanner(System.in);
       System.out.println("enter number : ");
       int no = sobj.nextInt();
       int iDigit = 0;
       int iCount = 0;

      while(no!= 0)
           
        {
            iDigit = no % 2;
            no = no/2;

            //System.out.println(iDigit);

            iCount = iCount + iDigit;
       }
       System.out.println("number of 0 is : "+iCount);
   
    }
}