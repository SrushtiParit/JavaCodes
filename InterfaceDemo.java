//Interface acheives 100% abstraction as all methods are abstract

class InterfaceDemo
{
    public static void main (String a[])
    {
        System.out.println("The value of PI is " +Circle.PI);
     // Circle.PI = 7.12f;  not allowed as PI is interface member and is final characteristics
        Circle cobj = new Marvellous();
    // we can create reference of interface as shown above but we cannot create object of circle 
        float ret = 0.0f;
        ret = cobj.Area(10.5f);
        System.out.println("Area is " +ret);
        ret = cobj.Circumference(10.5f);
        System.out.println("circunference is " +ret);
    }
}
interface Circle
{
    float PI = 3.14f;          //public static final float 
    float Area(float Radius);  //public abstract float Area(float Radius)
    float Circumference(float Radius);   //public abstract float Circumference(float Radius)
}

class Marvellous implements Circle
{
    public float Area(float Radius)
    {
        return PI * Radius * Radius;
    }
    public float Circumference(float Radius)
    {
        return 2 * PI * Radius;
    }
}
