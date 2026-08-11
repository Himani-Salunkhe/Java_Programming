import java.util.Scanner;

class program623
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

/*
    Decimal             Hexadecimal             Binary                      

    0                       0                     0000                
    1                       1                     0001
    2                       2                     0010
    3                       3                     0011
    4                       4                     0100
    5                       5                     0101
    6                       6                     0110
    7                       7                     0111
    8                       8                     1000
    9                       9                     1001
    10                      a                     1010
    11                      b                     1011                   
    12                      c                     1100
    13                      d                     1101
    14                      e                     1110
    15                      f                     1111


    Hexadecimal number formation :

    1011    1111    1000    0101    0011    1011    1110    0001
    b       f       8       5       3       b       e       1

    no = 0xbf853be1

i.e another ex
    2^3   2^2  2^1   2^0  
    0      0    0     0

      8      4     2     1

*/