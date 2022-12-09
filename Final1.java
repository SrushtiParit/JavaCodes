//Same as constant characteristics of class from C++

class Final1
{
    public static void main (String a[])
    {
        final int i = 51;       //i is not a characteristics it is an local variable of main 
        Demo obj = new Demo();
        obj.No1++;
  //    obj.No2++;
  //    obj.No3++;
    }
}

class Demo
{
    public int No1;
    public final int No2 = 11;     //const int No2;
    public final int No3;         //const int No3;

    public Demo()      //:No2(11), No3(21)
    {
        No1 = 0;
        No3 = 21;        //NA in c++
    }
}
