//Their are three threads here one is of main which is like in-built
//and the rest two are t1 and t2 which we have given
class ThreadDemo4
{
    public static void main(String arr[])
    {
        System.out.println("Inside main method");
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();
        Thread t1 = new Thread(obj1);   //creating a thread
        Thread t2 = new Thread(obj2);

        t1.setName("First");          //seting the name to the thread 
        t2.setName("Second");
        t1.start();        //start internally calls run function
        t2.start();

    }
}

class Demo extends Thread 
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