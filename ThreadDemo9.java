/* priority demostration:
the range of priority of thread is between 1 to 10 
10 is the highest priority and 1 is the least priority, and default priority for every thread if not given explicitly is 5

 */

class ThreadDemo9
{
    public static void main(String arr[])   
    {
        System.out.println("Inside main method");
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();
        Thread t1 = new Thread(obj1);  // new 
        Thread t2 = new Thread(obj2);   //can only create thread obj of such a class object that either extends thread or implements runnable
        System.out.println("The priority of main thread is "+Thread.currentThread().getPriority());

        t1.setName("First");         
        t2.setName("Second");

        System.out.println("Priority of t1 is: " +t1.getPriority());
        System.out.println("Priority of t2 is: " +t2.getPriority());

        t1.setPriority(10);      //explicitly setting the priority of a thread
        t2.setPriority(3);      //no need to do this 

        System.out.println("Priority of t1 is: " +t1.getPriority());
        System.out.println("Priority of t2 is: " +t2.getPriority());


        try
        {
            t1.start();       //runnable
            t2.start();

            t1.join();
            t2.join();       //waiting
        }
        catch( InterruptedException obj)
        {}
        System.out.println("End of main thread");

    }
}

class Demo extends Thread 
{
    public void run()    
    {
        int i = 0; 
        for (i = 1; i<=10; i++)
        {
            try
            {
                System.out.println(Thread.currentThread().getName()+ " : " +i); //running
                Thread.sleep(500);
            }
            catch(InterruptedException obj)
            {}
        }
    }

}