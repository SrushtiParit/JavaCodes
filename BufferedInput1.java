import java.io.*;
 
class BufferedInput
{
    public static void main (String arr[]) throws IOException
    {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);

//      BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        String name = null;
        int Age = 0;
        float marks = 0.0f;
        
        System.out.println("Enter your name: ");
        name = bobj.readLine();    //string ghetli 

        System.out.println("Enter your age: ");
        Age = Integer.parseInt(bobj.readLine());    //Integer is  a wrraper class which is inbuilt
                                                    //parseInt is static method so we access it using class
        System.out.println("Enter your Marks: ");
        marks = Float.parseFloat(bobj.readLine());  //string ghetli and float madhey convert kela 
    
        System.out.println("Name: " +name);
        System.out.println("Age: " +Age);
        System.out.println("Marks: " +marks);
    }
}


//here we are not handling exception rather telling that main can throw and exception
//JVM calls main function so we ask JVM to handle that  
//bufferreader has size and its dependent on jvm