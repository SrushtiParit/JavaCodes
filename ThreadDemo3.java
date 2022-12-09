
class ThreadDemo3
{
    public static void main(String arr[])
    {
        System.out.println("Inside main method");
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.setName("First");          //seting the name to the thread 
        t2.setName("Second");
        t1.start();        //start internally calls run function
        t2.start();

    }
}

class Demo implements Runnable 
{
    public void run()    //run is an in-built function
    {
        int i = 0; 
        for (i = 1; i<=1000; i++)
        {
            System.out.println(Thread.currentThread().getName()+ " : " +i);
        }
    }

}