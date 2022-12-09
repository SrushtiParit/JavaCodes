//abstract class is a class which contains 0 or more abstract method in it 
//we cannot create object of abstract 

class AbstractDemo 
{
    public static void main (String a[])
    {
   //   Arithematic aobj = new Arithematic();    not allowed  (creating object of abstract class is not allowed)
        Arithematic aobj = new Marvellous();   //allowed   (creating reference of abstract class is allowed) 
        Marvellous mobj = new Marvellous();
        int ret = 0;
        ret = mobj.Addition(11, 10);
        System.out.println("Addition is "+ret);
        ret =  mobj.Substraction(11, 10 );
        System.out.println("Substraction is "+ret);
    }
}
abstract class Arithematic 
{
    public int Addition(int No1, int No2)
    {
        return No1 + No2;
    }
    public abstract int Substraction(int No1, int No2);
}
class Marvellous extends Arithematic
{
    public int Substraction(int No1, int No2)
    {
        return No1 - No2;
    }
}

