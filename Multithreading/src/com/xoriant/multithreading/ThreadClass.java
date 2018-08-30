package com.xoriant.multithreading;

public class ThreadClass extends Thread {
	ThreadClass(String Name){
		setName(Name);
		start();
	}
	@Override
	public void run() {
		System.out.println("In run");
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+i);
			try {
				sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
//		ThreadClass c;
		Thread t=new ThreadClass(("Pahila Thread"));
		Thread t1=new Thread(new ThreadClass("Dusra Thread"));
		Thread t2=new Thread(new ThreadClass("Tisra Thread"));
		System.out.println(t);
		System.out.println(t1);
		System.out.println(t2);
//		t.start();
//		t1.start();
//		t2.start();
//		ThreadClass c=new ThreadClass();
//		c.run();
		for(int i=0;i<10;i++)
			System.out.println("Main Thread :"+i);
	}
}
