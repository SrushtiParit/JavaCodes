class StaticDemo 
{
    static
    {
        System.out.println("Inside static block of main ");
    }
    //as object of staticdemo does not get created so constructor defined below 
    //will not be displayed this also proves that without creating object 
    //of StaticDemo we are able to print main 
    public StaticDemo()
    {
        System.out.println("Inside constructor of staticdemo ");
    }
    public static void main(String arg[])
    {
        System.out.println("Inside Main");
        //Demo obj;  this is reference
        System.out.println("Value of static No3: " +Demo.No3);
        System.out.println("Value of static No4: " +Demo.No4);
        Demo.gun();

        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        obj1.fun();
    }
}

class Demo
{
    public int No1;         //non-static characteristics
    public int No2;         //non-static characteristics
    public static int No3;       //static characteristics
    public static int No4;       //static characteristics

//static block gets called only once throughout the program no matter how many objects we create 
//static block gets called before constructor and before any object is create 

    static                       //static block 
    {
        System.out.println("Inside static block of class demo ");
        No3 = 51;
        No4 = 101;
    }
    public Demo()
    {
        System.out.println("Inside constructor ");
        No1 = 11;
        No2 = 21;
    }
    public void fun()
    {

        //this keyword could be used to access 
        //if it was c++ we would have gave this->

        System.out.println("Inside non static method");
        System.out.println("The value of No1:" +this.No1);
        System.out.println("The value of No2:" +this.No2);
        System.out.println("The value of No3:" +this.No3);
        System.out.println("The value of No4:" +this.No4);
        
    }
    public static void gun()
    {

        //In static this keyword cannot be used
        //this keyword is only allowed in nonstatic 
        //static method can only access static variables 
        System.out.println("Inside static method ");
       // System.out.println("The value of No1:" +No1);    not allowed
        //System.out.println("The value of No2:" +No2);    not allowed
        System.out.println("The value of No3:" +No3);
        System.out.println("The value of No4:" +No4);

    }
}