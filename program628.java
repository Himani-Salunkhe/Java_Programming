import java.util.Scanner;

class program628
{
    public static void main(String A[]) 
    {
        int iNo = 0,iMask = 0,iResult = 0;
       Scanner sobj = new Scanner(System.in);
      
       System.out.println("enter number : ");
        iNo = sobj.nextInt();

       iMask = 0x80000000;
    
       iResult = iNo & iMask;

       if(iResult == iMask)
       {
          System.out.println("8th bit is ON");
       }
       else
       {
          System.out.println("8th bit is OFF");
       }
    }
}

//1000   0000
//8      0