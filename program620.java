import java.util.Scanner;

class program620
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

            if(iDigit == 1)
            {
                iCount++;
            }
       }
       System.out.println("number of 1's are : "+iCount);
   
    }
}