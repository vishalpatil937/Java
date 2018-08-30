package com.xoriant.multithreading;

class MyThread extends Thread
{
    @Override
    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            try
            {
                Thread.sleep(2000);
                System.out.println("Current Thread: "+ Thread.currentThread().getName()+ " : " +i);
            }catch(Exception e){
                e.printStackTrace();
            }
           
        }
    }
}

public class ThreadJoining
{
    public static void main (String[] args)
    {
      MyThread t1 = new MyThread();
       MyThread t2 = new MyThread();
       MyThread t3 = new MyThread();
      t1.start();

        try
        {
            System.out.println("Current Thread: "+ Thread.currentThread().getName());
            t1.join();
            t2.start();
            System.out.println("Current Thread: "+ Thread.currentThread().getName());
            t2.join();
        }

        catch(Exception e)
        {
            e.printStackTrace();
        }

        t3.start();
    }
}
