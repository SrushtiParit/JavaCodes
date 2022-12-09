import java.util.*;       //scanner is built-in class in util in java
// import java.util.Scanner;

class Input
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);   //scanner class cha object with dynamic memory
        //Scanner(system.in)  is parameterized constructor
        int iNo1 = 0;
        int iNo2 = 0;
        int iAns = 0;

        System.out.println("enter the first number: ");
        iNo1 = sobj.nextInt();

        System.out.println("enter the second number: ");
        iNo2 = sobj.nextInt();
        
        iAns = iNo1 + iNo2;

        System.out.println("Addition is: " +iAns);
    }
}



/*
Methods of Scanner class

boolean            nextBool()
byte               nextByte()
char               nextLine()
int 
float
double 
short
long
*/