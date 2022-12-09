import java.util.*;

class Collections1
{
    public static void main (String arg[])
    {
        LinkedList <Integer> lobj = new LinkedList <Integer> ();
        lobj.add(11);
        lobj.add(21);
        lobj.add(51);
        lobj.add(101);
        lobj.add(111);

        System.out.println("elements of the linkedlist are: " +lobj);

        lobj.addFirst(1);
        System.out.println("elements of the linkedlist are: " +lobj);

        lobj.addLast(121);
        System.out.println("elements of the linkedlist are: " +lobj);

/////////////////////////////////////////////////////////////////////////

    //method that is used to iterate through the linked list is as follows
        Iterator iobj = lobj.iterator();
        System.out.println("Data using iterator is: ");
        while(iobj.hasNext())   //hasNext is a inbuilt method which returns true if data is present or-else it returns false
        {
            System.out.println(iobj.next());
        }

////////////////////////////////////////////////////////////////////////
        if(lobj.contains(121))
        {
            System.out.println("121 is present in the linked list");
        }
        else
        {
        System.out.println("121 is not present in the linked lsit ");
        }
/////////////////////////////////////////////////////////////////////////

        lobj.remove();
        System.out.println("elements of the linkedlist are: " +lobj);

    //indexing starts from 0 
    //used to remove elements from a specific index
        lobj.remove(0);        
        System.out.println("elements of the linkedlist are: " +lobj);

        lobj.removeLast();
        System.out.println("elements of the linkedlist are: " +lobj);

///////////////////////////////////////////////////////////////////////////

        System.out.println("Size of the linkedlist is: " +lobj.size());

///////////////////////////////////////////////////////////////////////////

    //used set a value at a specific index number
        lobj.set(1, 500);
        System.out.println("elements of the linkedlist are: " +lobj);

////////////////////////////////////////////////////////////////////////////

    //used to remove all elements from linked list
        lobj.clear();
        System.out.println("elements of the linkedlist are: " +lobj);



    }
}