import java.util.*;

class Collections8
{
    public static void main(String Arr[])
    {
        Hashtable <String, Integer>hobj = new Hashtable<String, Integer>();

        //first value is key and second is value 
        hobj.put("PPA", 18000);
        hobj.put("LB", 17000);
        hobj.put("Python", 16500);
        hobj.put("LSP", 21000);

        System.out.println(hobj.get("Python"));

        Enumeration eobj = hobj.keys();     //this will give key 

        while(eobj.hasMoreElements())
        {
            System.out.println("Value is: "+eobj.nextElement());
        }

        hobj.remove("LB");
        hobj.clear();
        
    }
}