//Problem statement division of two numbers 

import java.util.*;

class ExceptionDemoSolution
{
    public static void main (String arr[])
    {
        Scanner sobj = new Scanner (System.in);
        int iAns = 0;
        
        System.out.println("Enter first number ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter second number ");
        int iNo2 = sobj.nextInt();

        
        try
        {
            System.out.println("Inside try block");
            iAns = iNo1/iNo2;
            System.out.println("The division is " +iAns);
        }
        catch(ArithmeticException obj)
        {
            System.out.println("Inside catch 1");
            System.out.println(obj);
        }
        catch(NullPointerException obj)
        {
            System.out.println("Inside catch 2");
            System.out.println(obj);
        }
        catch(Exception obj)    //exception is parent class of all the exception (it will catch all the exception )(also called as generic exception)
        {
            System.out.println("Inside catch 3");
            System.out.println(obj);
        } 
        finally 
        {
            System.out.println("Inside finally block ");
            sobj.close();
        }

    }
}

/* Exception in thread "main" java.lang.ArithmeticException: / by zero
        at ExceptionDemo1.main(ExceptionDemo1.java:18) */