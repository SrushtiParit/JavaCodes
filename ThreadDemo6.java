/*join method gives exception so we write throws exception  */

class ThreadDemo6
{
    public static void main(String arr[]) throws InterruptedException    
    {
        System.out.println("Inside main method");
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();
        Thread t1 = new Thread(obj1);  // new 
        Thread t2 = new Thread(obj2);

        t1.setName("First");         
        t2.setName("Second");
        t1.start();       //runnable
        t2.start();

        t1.join();       //waiting for a reason
        t2.join();       //waiting

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