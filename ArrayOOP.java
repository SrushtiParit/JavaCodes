import java.util.Scanner;



class ArrayOOP
{
     public static void main(String arg[])
     {
          ArrayX obj1 = new ArrayX(4);
          obj1.Accept();
          obj1.Display();

          int iRet = obj1.Addition();
          System.out.println("Addition is : "+iRet);
     }
}



class ArrayX
{
     public int Arr[];
     public int iSize;

     public ArrayX(int No)
     {
          this.iSize = No;
          this.Arr = new int[iSize];
     }
     
     public void Accept()
     {
          Scanner sobj = new Scanner(System.in);
          System.out.println("Enter the elements : ");
          for(int iCnt = 0; iCnt < iSize; iCnt++)
          {
               Arr[iCnt] = sobj.nextInt();
          }
     }

     public void Display()
     {
          System.out.println("Elements of array are : ");
          for(int iCnt = 0; iCnt < iSize; iCnt++)
          {
               System.out.println(Arr[iCnt]);
          }
     }

     public int Addition()
     {
          int iSum = 0;
          for(int iCnt = 0; iCnt < iSize; iCnt++)
          {
               iSum = iSum + Arr[iCnt];
          }   
          return iSum;
     }
}






/*While running this code i got an error which was 
error: can't find main(String[]) method in class: ArrayX 
I solved this error by just shifting main class to the top 
and ArrayX class to the bottom dont know how but the error got
solved  
 */