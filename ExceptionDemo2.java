
import java.util.*;

class ExceptionDemo2
{
    public static void main (String arr[])
    {
        Scanner sobj = new Scanner (System.in);
        int Arr[] = {10, 20, 30, 40 };

        System.out.println("Enter the index of array");
        int i = sobj.nextInt();
        System.out.println("Data at the specified index is: " +Arr[i]);

    }
}


/* Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 4
        at ExceptionDemo1.main(ExceptionDemo2.java:14) */