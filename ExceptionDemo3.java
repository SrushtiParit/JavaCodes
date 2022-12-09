
import java.util.*;

class ExceptionDemo3
{
    public static void main (String arr[])
    {
        String s1 = "Marvellous";
        String s2 = null;

        System.out.println("data of s1 is :" +s1);
        System.out.println("data of s2 is :" +s2);

        System.out.println("length of s1 is :" +s1.length());
        System.out.println("length of s2 is :" +s2.length());
    }
}

/*Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local2>" is null
        at ExceptionDemo1.main(ExceptionDemo3.java:15) */