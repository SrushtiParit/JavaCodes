/* 
java.lang package has object class, object class is parent class of all the classes
every java file has default package that is java.lang.*;
object class has clone method, finalize method(destructor) etc
class Object
{
    code 
}
 */


class Single
{
    public static void main (String arr[])
    {
   //   Base bobj1 = new Base();          //No Casting
   //   Derived dobj1 = new Derived();      //No Casting 
        Base bobj2 = new Derived();       //upcasting ()
  //    Derived dobj2 = new Base();       //downcasting (not allowed)

       /* dobj1.fun();
        dobj1.fun(11);
        dobj1.gun();
        dobj1.sun(); */
        
        bobj2.fun();
        bobj2.fun(11);
        bobj2.gun();
        bobj2.sun();
    }
}
class Base   //class Base extends Object
{
    public int A,B;
    public Base()
    {
        System.out.println("Base Constructor");
        this.A = 10;
        this.B = 20;
    }
    public void fun()        //definition 
    {
        System.out.println("Inside Base fun ");
    }
    public void gun()      //definition 
    {
        System.out.println("Inside Base gun");
    }
    public void fun(int No)      //function overloading       //overloaded definition 
    {
        System.out.println("Inside Base fun with one integer");
    }
}

class Derived extends Base    //class Derived: public Base    in C++
{
    public int X,Y;
    public Derived()
    {
        System.out.println("Derived constructor ");
        this.X = 30;
        this.Y = 40;
    }
    public void sun()      //definition 
    {
        System.out.println("Inside Derived sun ");
    }
    public void gun()     //overided definition 
    {
        System.out.println("Inside derived gun");
    }
}


//runtime method dispatch 