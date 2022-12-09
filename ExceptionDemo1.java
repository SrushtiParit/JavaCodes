//Problem statement division of two numbers 

import java.util.*;

class ExceptionDemo1
{
    public static void main (String arr[])
    {
        Scanner sobj = new Scanner (System.in);
        
        System.out.println("Enter first number ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter second number ");
        int iNo2 = sobj.nextInt();

        int iAns = 0;
        iAns = iNo1/iNo2;

        System.out.println("The division is " +iAns); 

    }
}

/* Exception in thread "main" java.lang.ArithmeticException: / by zero
        at ExceptionDemo1.main(ExceptionDemo1.java:18) */