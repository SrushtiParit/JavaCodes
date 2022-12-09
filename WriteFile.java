import java.io.*;

class WriteFile
{
    public static void main(String arg[]) throws Exception
    {
        FileOutputStream fobj = new FileOutputStream("Marvellous.txt");

        String Data = "Marvellous Infosystem Pune";

/* Here java says that data being written in file should be in byte format but we cannot accept from user data in byte 
so we accept data in string and convert it in array of byte by using getBytes method*/

        byte bdata[]= Data.getBytes();

        fobj.write(bdata);
        fobj.close();
    }
}