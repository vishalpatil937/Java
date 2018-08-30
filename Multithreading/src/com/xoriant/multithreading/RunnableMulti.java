package com.xoriant.multithreading;

public class RunnableMulti implements Runnable{
	Thread thread;
	public RunnableMulti(String Name) {
		thread=new Thread(this);
		thread.setName(Name);
//		thread.setPriority(1);
//		thread.start();
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++)
			System.out.println(thread.getName()+":"+i);
	}

	public static void main(String[] args) {
		Thread rm=new Thread(new RunnableMulti("Uno"));
		Thread rm1=new Thread(new RunnableMulti("Dos"));
		Thread rm2=new Thread(new RunnableMulti("Tres"));
		rm.start();
		rm1.start();
		rm2.start();
		
		for(int i=0;i<10;i++)
			System.out.println("Main Thread:"+i);
		System.out.println(rm1);
	}
}
