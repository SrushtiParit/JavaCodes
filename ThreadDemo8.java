/* priority demostration:
the range of priority of thread is between 1 to 10 
10 is the highest priority and 1 is the least priority, and default priority for every thread if not given explicitly is 5

 */

class ThreadDemo8
{
    public static void main(String arr[])   
    {
        System.out.println("Inside main method");
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();
        Thread t1 = new Thread(obj1);  // new 
        Thread t2 = new Thread(obj2);

        t1.setName("First");         
        t2.setName("Second");

        System.out.println("Priority of t1 is: " +t1.getPriority());
        System.out.println("Priority of t2 is: " +t2.getPriority());
        try
        {
            t1.start();       //runnable
            t1.join();       //waiting for a reason

            t2.start();
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
                System.out.println("The priority of given thread is "+Thread.currentThread().getPriority())
            }
            catch(InterruptedException obj)
            {}
        }
    }

}