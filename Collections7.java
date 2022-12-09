import java.util.*;

class Collections7
{
    public static void main(String Arr[])
    {
        Stack <Character>sobj = new Stack<Character>();
        sobj.push('a');
        sobj.push('b');
        sobj.push('c');
        sobj.push('d');
        sobj.push('e');

        System.out.println("Elements of the stack: "+sobj);

        System.out.println("Poped element is: "+sobj.pop());

        System.out.println("Elements of the stack: "+sobj);

        
    }
}